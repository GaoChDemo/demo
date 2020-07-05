package top.gaoch.demo;

public class MNA {
  private void f() {
    System.out.println("f()");
  }

  class A {
    private void f() {
      System.out.println("g()");
    }

    public class B {
      void h() {
        f();
        MNA.this.f();
      }
    }
  }
}
