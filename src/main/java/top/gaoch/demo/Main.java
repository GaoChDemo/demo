package top.gaoch.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
  private static int[] F = new int[] {0, 1, 1, 2, 3, 5, 8, 13, 21};

  public static void main(String[] args) {

    List<String> codes = new ArrayList<String>();
    codes.add("11231");
    codes.add("2312");
    codes.add("33123");
    codes.add("414441");
    codes.add("51231");
    codes.add("612313");
    for (String code : codes) {
      System.out.println("这是String类型:" + code);
    }
    System.out.println("+++++++++++++++++++++++++++++++++");
    List<Integer> codesInteger = codes.stream().map(Integer::parseInt).collect(Collectors.toList());
    for (Integer code : codesInteger) {
      System.out.println("这是Integer类型:" + code);
    }
    System.out.println("++++++++++++++++++++++");
    codes.remove("51231");
    List<String> codesString = codes.stream().map(String::valueOf).collect(Collectors.toList());
    for (String code : codesString) {
      System.out.println("这是String类型:" + code);
    }
    //System.out.println(Integer.MAX_VALUE);
    //System.err.println(fibonacciSearch(88,new int[]{0,1,16,24,35,47,59,62,73,88}));
  }

  public static int binarySearch(int x, int[] arr) {
    int low = 0;
    int high = arr.length - 1;
    int mid;
    while (low <= high) {
      mid = (low + high) / 2;
      if (x < arr[mid]) {
        high = mid - 1;
      } else if (x > arr[mid]) {
        low = mid + 1;
      } else {
        return mid;
      }
    }
    return 0;
  }

  public static int fibonacciSearch(int key, int[] arrOld) {
    int low = 0;
    int high = arrOld.length - 1;
    int mid;
    int k = 0;
    while (high > F[k]) {
      k++;
    }

    int[] arr = new int[F[k]];
    for (int i = 0; i < F[k] - 1; i++) {
      if (i < arrOld.length) {
        arr[i] = arrOld[i];
      } else {
        arr[i] = arrOld[arrOld.length - 1];
      }
    }
    while (low <= high) {
      mid = low + F[k - 1] - 1;
      if (key < arr[mid]) {
        high = mid - 1;
        k = k - 1;
      } else if (key > arr[mid]) {
        low = mid + 1;
        k = k - 2;
      } else {
        if (mid <= arrOld.length - 1) {
          return mid;
        } else {
          return arrOld.length - 1;
        }
      }
    }

    return 0;
  }
}
