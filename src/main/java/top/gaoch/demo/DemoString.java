package top.gaoch.demo;

public class DemoString {
  public static void main(String[] args) {
    String str = "Hello";
    modify(str);
    System.out.println(str);
  }
  public static void modify(String str){
    str += "world!";
  }
}
