package top.gaoch.demo;

/**
 * 添加标记为如果没有交换就结束 冒泡排序
 */
public class BubbleSort {
  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5};
    System.out.println("排序前数组为：");
    for (int num : arr) {
      System.out.print(num + " ");
    }
    boolean flag = true;
    for (int i = 0; i < arr.length - 1 && flag; i++) {//外层循环控制排序趟数
      flag = false;
      for (int j = 0; j < arr.length - 1 - i; j++) {//内层循环控制每一趟排序多少次
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
          flag = true;
        }
      }
    }
    System.out.println();
    System.out.println("排序后的数组为：");
    for (int num : arr) {
      System.out.print(num + " ");
    }
  }
}