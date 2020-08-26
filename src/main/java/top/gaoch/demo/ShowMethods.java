package top.gaoch.demo;

import lombok.Data;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

public class ShowMethods {
  private final static String usage = "no arg";

  private static Pattern p = Pattern.compile("\\w+\\.");

  @Data
  public static class AAA{
    String aa;
  }
  public static void main(String[] args) {
    String arg = "demo.ShowMethods";
    AAA a = new AAA();
    a.setAa("数据采集    ");
    try {
      Class<?> c = Class.forName(arg);
      Method[] methods = c.getMethods();
      Constructor<?>[] constructors = c.getConstructors();

      for (Method method : methods) {
        System.out.println(p.matcher(method.toString()).replaceAll(""));
      }

      for (Constructor<?> constructor : constructors) {
        System.out.println(p.matcher(constructor.toString()).replaceAll(""));
      }

    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }


}
