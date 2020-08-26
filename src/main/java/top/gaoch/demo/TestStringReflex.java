package top.gaoch.demo;

import java.lang.reflect.Field;

public class TestStringReflex {
  public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
    final String a = "abc";
    final String b = "def";

    Field value = String.class.getDeclaredField("value");
    value.setAccessible(true);
    value.set(a, new char[]{'1','2','3'});
    value.set(b, new char[]{'4','5','6'});

    System.out.println(a); //
    System.out.println(b); //
    System.out.println(a + b); //
  }
}
