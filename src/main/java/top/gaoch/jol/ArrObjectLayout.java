package top.gaoch.jol;


import org.openjdk.jol.info.ClassLayout;

public class ArrObjectLayout {
  public static void main(String[] args) {

    int[] arr = new int[4];



    System.out.println(ClassLayout.parseInstance(arr).toPrintable(arr));


  }
}
