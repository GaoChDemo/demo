package top.gaoch.demo;

import java.lang.reflect.Field;

public class StringNumberDemo {
  public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
    final String a = "abc";
    final String b = "def";

    Field value = String.class.getDeclaredField("value");
    value.setAccessible(true);
    value.set(a,new char[]{'1','2','3'});

    String c = a + b;
    System.out.println(a);
    System.out.println(c);
  }
}
