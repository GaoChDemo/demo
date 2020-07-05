package top.gaoch.demo;

public class ClassOutDemo {


  public static void main(String[] args) {
    ClassOutDemoB classOutDemoB = new ClassOutDemoB();
    System.out.println(classOutDemoB.getIIII());
  }

  static class ClassOutDemoA {
    public int i = 1;

    public int getIIII () {
      return i;
    }
  }


  static class ClassOutDemoB extends ClassOutDemoA {
    public int i = 2;

//    public int getIIII () {
//      return i;
//    }
  }
}
