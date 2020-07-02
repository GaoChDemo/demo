package top.gaoch.demo;

public class DemoExample {
  public static void main(String[] args) {
    try {
      throw new ExampleB("b");
    }catch (ExampleA e){
      System.out.println("ExampleA");
    }catch (Exception e){
      System.out.println("Exception");
    }
  }
}


class ExampleA extends Exception{
  public ExampleA() {
  }
  public ExampleA(String str){

  }
}


class ExampleB extends ExampleA{
  public ExampleB() {
  }

  public ExampleB(String str){

  }
}