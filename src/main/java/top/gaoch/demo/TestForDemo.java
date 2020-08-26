package top.gaoch.demo;

public class TestForDemo {
  public static void main(String[] args) {
    test1();
    test2();

  }

  public static void test1 () {
    Object o = null;
    for (int i = 0; i < 1000_0000; i++) {
      o = new Object();
    }
  }


  public static void test2 () {
    for (int i = 0; i < 1000_0000; i++) {
      Object o = new Object();
    }
  }
}
