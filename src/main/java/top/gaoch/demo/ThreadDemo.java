package top.gaoch.demo;

import java.util.Date;
import java.util.concurrent.*;

class MyRunnable implements Runnable {
  public void run() {
    for (int i = 0; i < 100; i++) {
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println(Thread.currentThread().getName() + " MyRunnable 11111");
    }
  }
}


class MyThread extends Thread {
  public void run() {
    for (int i = 0; i < 100; i++) {
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println(Thread.currentThread().getName() + " MyThread 222222");
    }
  }
}


class MyCallable implements Callable {

  @Override
  public Object call() throws Exception {
    for (int i = 0; i < 100; i++) {
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println(Thread.currentThread().getName() + " MyCallable 333333");
    }
    return true;
  }
}


public class ThreadDemo {
  public static void main(String[] args) throws ExecutionException, InterruptedException {
    ExecutorService executor = Executors.newCachedThreadPool();
//
//    MyRunnable myRunnable = new MyRunnable();
//    executor.execute(myRunnable);
//
//    MyThread myThread = new MyThread();
//    executor.execute(myThread);
//
//    MyCallable myCallable = new MyCallable();
//    Future<Boolean> submit = executor.submit(myCallable);
//    Future<Boolean> submit1 = executor.submit(myCallable);
//
//    System.out.println(submit.get());
//    System.out.println(submit1.get());
//
    //    executor.shutdown();
    new Thread().setDaemon(true);
    ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(3);
//    scheduledThreadPool.schedule(new Runnable() {
//      @Override
//      public void run() {
//        System.out.println("延迟三秒 " + new Date());
//      }
//    }, 3, TimeUnit.SECONDS);

    System.out.println("now "+ new Date());
    scheduledThreadPool.scheduleAtFixedRate(new Runnable() {
      @Override
      public void run() {
        System.out.println("延迟 1 秒后每三秒执行一次"+ new Date());
      }
    }, 1, 3, TimeUnit.SECONDS);

    return;
  }
}
