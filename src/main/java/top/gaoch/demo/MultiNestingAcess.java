package top.gaoch.demo;

public class MultiNestingAcess {
  public static void main(String[] args) {
    MNA mna = new MNA();
    MNA.A a = mna.new A();
    MNA.A.B b = a.new B();
    b.h();
  }
}
