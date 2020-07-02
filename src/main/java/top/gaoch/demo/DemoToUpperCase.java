package top.gaoch.demo;

import java.lang.reflect.Method;

public class DemoToUpperCase {
  public static void main(String[] args) throws Exception {
    String str = "Hello World.";
    Method m = str.getClass().getMethod("toUpperCase");
    System.out.println(m.invoke((str)));
  }
}
