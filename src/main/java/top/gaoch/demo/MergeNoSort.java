package top.gaoch.demo;

import java.util.Arrays;

/**
 * 归并排序 非递归
 */
public class MergeNoSort {
  public static void main(String[] args) {
    int[] arr = {3, 8, 4, 6, 5, 7, 9, 2, 1};
    sort(arr);
    System.out.println(Arrays.toString(arr));
  }

  public static void sort(int[] arr) {
    int[] temp = new int[arr.length];//在排序前，先建好一个长度等于原数组长度的临时数组，避免递归中频繁开辟空间
    for (int i = 1; i <= arr.length; i *= 2) {
      for (int j = 0; j + i <= arr.length; j += i * 2) {
        //Math.min 的目的是处理 整个待排序数组为奇数的情况
        merge(arr, j, j + i - 1, Math.min(j + 2 * i - 1, arr.length - 1),temp);
      }
    }
  }

  private static void merge(int[] arr, int left, int mid, int right, int[] temp) {
    int i = left;//左序列指针
    int j = mid + 1;//右序列指针
    int t = 0;//临时数组指针
    while (i <= mid && j <= right) {
      if (arr[i] <= arr[j]) {
        temp[t++] = arr[i++];
      } else {
        temp[t++] = arr[j++];
      }
    }
    while (i <= mid) {//将左边剩余元素填充进temp中
      temp[t++] = arr[i++];
    }
    while (j <= right) {//将右序列剩余元素填充进temp中
      temp[t++] = arr[j++];
    }

    //将temp中的元素全部拷贝到原数组中
//    t = 0;
//    while (left <= right) {
//      arr[left++] = temp[t++];
//    }
    //可以优化成下面的写法
    System.arraycopy(temp, 0, arr, left, right-left+1);
  }
}