package top.gaoch.demo;

public class QuickSort {
  public static void main(String[] args) {
    int i = 0;
    int arr[] = {5, 4, 9, 8, 7, 6, 0, 1, 3, 2};
    sort(arr, 0, arr.length - 1);
    for (i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void sort(int array[], int low, int high) {
    int i, j;
    int index;
    if (low >= high) {
      return;
    }
    i = low;
    j = high;
    index = array[i];
    //index = array[(low+high)/2];
    //array[(low+high)/2] = array[i];
    while (i < j) {
      while (i < j && array[j] >= index) {
        j--;
      }
      if (i < j) {
        array[i++] = array[j];
      }
      while (i < j && array[i] < index) {
        i++;
      }
      if (i < j) {
        array[j--] = array[i];
      }
      array[i] = index;
      sort(array, low, i - 1);
      sort(array, i + 1, high);
    }
  }
}
