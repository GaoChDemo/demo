package top.gaoch.jol;


import org.openjdk.jol.info.ClassLayout;

public class JavaObjectLayout {
  public static void main(String[] args) {

    Object o = new Object();



    System.out.println(ClassLayout.parseInstance(o).toPrintable(o));


    synchronized (o) {
      System.out.println(ClassLayout.parseInstance(o).toPrintable(o));
    }
  }
}
