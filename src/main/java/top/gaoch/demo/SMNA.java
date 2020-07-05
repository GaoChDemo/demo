package top.gaoch.demo;

public class SMNA {
  private void f() {
    System.out.println("f()");
  }

  static class A {
    private void f() {
      System.out.println("g()");
    }

    public static class B {
      void h() {
      }
    }
  }
}
