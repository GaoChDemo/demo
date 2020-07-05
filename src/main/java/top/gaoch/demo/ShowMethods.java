package top.gaoch.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

public class ShowMethods {
  private final static String usage = "no arg";

  private static Pattern p = Pattern.compile("\\w+\\.");

  public static void main(String[] args) {
    String arg = "demo.ShowMethods";

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
