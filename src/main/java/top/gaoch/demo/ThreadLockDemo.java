package top.gaoch.demo;

class MyThreadLockDemoData {
  public Integer number = 0;
  public void add() {
    number = 56;
  }
}


public class ThreadLockDemo {

  public static void main(String[] args) throws InterruptedException {
    MyThreadLockDemoData data = new MyThreadLockDemoData();
    new Thread( () -> {
      synchronized (data) {
        System.out.println(Thread.currentThread().getName() + " data.number :" + data.number );
        data.add();
        System.out.println(Thread.currentThread().getName() + "  data.number :" + data.number );
      }

      try {
        Thread.sleep(5000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println(Thread.currentThread().getName() + " end" );

    }, "t1").start();

    Thread.sleep(1000);
    new Thread( () -> {
      synchronized (data) {
        System.out.println(Thread.currentThread().getName() + " data.number :" + data.number );
        data.add();
        System.out.println(Thread.currentThread().getName() + "  data.number :" + data.number );
      }
    }, "t2").start();
  }
}
