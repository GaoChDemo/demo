package top.gaoch.demo;

import java.util.concurrent.atomic.AtomicInteger;

public class TestReturnFinally {
  public static int test() {
    try {
      return 1;
    } catch (Exception e) {

    } finally {
      return 2;
    }
  }


  public static void main(String[] args) {

    System.out.println(test());
  }
}