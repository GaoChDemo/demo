package top.gaoch.classdemo;

class WithInner {
  class Inner {
    class AAA {}

  }
}


public class InheritInner extends WithInner.Inner{
  public InheritInner(WithInner wi) {
    wi.super();
  }

  public static void main(String[] args) {

    Integer checkSequence = 0;
    String finalCheckSequenceStr = checkSequence < 0 ? "$_" + Math.abs(checkSequence) : "$" + checkSequence;

    System.out.println(finalCheckSequenceStr);
  }

}


class InheritOut extends WithInner {
  public InheritOut() {
  }

  public static void main(String[] args) {
    WithInner wi = new WithInner();
    WithInner.Inner wii = wi.new Inner();
    InheritOut ii = new InheritOut();
    WithInner.Inner iii = ii.new Inner();
  }

}
