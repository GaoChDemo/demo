package top.gaoch.demo;

class WithInner {
  class Inner {

  }
}


public class InheritInner extends WithInner.Inner{
  public InheritInner(WithInner wi) {
    wi.super();
  }

  public static void main(String[] args) {
    WithInner wi = new WithInner();
    InheritInner ii = new InheritInner(wi);
  }

}


class InheritOut extends WithInner{
  public InheritOut() {
  }

  public static void main(String[] args) {
    WithInner wi = new WithInner();
    WithInner.Inner wii = wi.new Inner();
    InheritOut ii = new InheritOut();
    WithInner.Inner iii = ii.new Inner();
  }

}
