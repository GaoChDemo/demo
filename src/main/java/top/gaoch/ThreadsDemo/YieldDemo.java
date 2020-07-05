package top.gaoch.ThreadsDemo;

public class YieldDemo {
  Object o = new Object();

  void m() {
    synchronized (o) {
      System.out.println(Thread.currentThread().getName() + "m()");

      try {
        Thread.sleep(3000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }


  public static void main(String[] args) {
    YieldDemo yieldDemo = new YieldDemo();

    Thread t1 = new Thread(yieldDemo::m, "a");

    t1.start();


    Thread t2 = new Thread(yieldDemo::m, "b");
    yieldDemo.o = new Object();

    t2.start();

  }
}
