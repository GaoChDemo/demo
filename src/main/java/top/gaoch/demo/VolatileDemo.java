package top.gaoch.demo;

import java.util.concurrent.TimeUnit;

class MyData {
  public Integer number = 0;
  public Integer aa = 0;
  public volatile Integer bb = 0;
  public void addNumber () {
    number = 66;
    aa = 66;
  }
}


public class VolatileDemo {
  public static void main(String[] args) {
    MyData myData = new MyData();


    new Thread(() ->{

      System.out.println(Thread.currentThread().getName() + " number :" + myData.number + "  aa: " + myData.aa);
      try {
        TimeUnit.SECONDS.sleep(3);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      myData.addNumber();
      System.out.println(Thread.currentThread().getName() + " number :" + myData.number + "  aa: " + myData.aa);
    }).start();

    while (myData.number == 0) {
//      System.out.println(Thread.currentThread().getName() + " 0000 bb :" + myData.bb);
      int a = myData.bb;
    }
    System.out.println(Thread.currentThread().getName() + " 1111 number :" + myData.number + "  aa: " + myData.aa);
//
//    while (myData.aa == 0) {
//
//    }

//    System.out.println(Thread.currentThread().getName() + " 2222 number :" + myData.number + "aa: " + myData.aa);

  }
}
