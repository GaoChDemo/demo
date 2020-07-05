package top.gaoch.demo;

public class WaitDemo {
  public static void main(String[] args) {

    Object o = new Object();
    try {
      synchronized (o) {
        System.out.println(" enter wait() ");
        o.wait(3000);
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println(" end() ");

  }
}
