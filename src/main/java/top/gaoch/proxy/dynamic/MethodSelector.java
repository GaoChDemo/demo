package top.gaoch.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MethodSelector implements InvocationHandler {
  private Object proxied;

  public MethodSelector(Object proxied) {
    this.proxied = proxied;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    System.out.println(String.format("%s : %s", "proxy", args == null ? "null" : args.toString()));
    return method.invoke(proxied, args);
  }

}


interface SomeMethods {
  void boring1();

  void boring2();

  void interesting(String arg);

  String boring3();
}


class Implementation implements SomeMethods {

  @Override
  public void boring1() {
    System.out.println("boring1");
  }

  @Override
  public void boring2() {
    System.out.println("boring2");
  }

  @Override
  public void interesting(String arg) {
    System.out.println(String.format("intereting %s", arg));
  }

  @Override
  public String boring3() {
    System.out.println("boring3");
    return "boring3 result";
  }
}


class SelectingMethods {
  public static void main(String[] args) {
    SomeMethods someMethods = (SomeMethods) Proxy.newProxyInstance(SomeMethods.class.getClassLoader(), new Class[] {SomeMethods.class}, new MethodSelector(new Implementation()));
    someMethods.boring1();
    someMethods.boring2();
    someMethods.interesting("aaaaaa");
    String s = someMethods.boring3();
    System.out.println(s);

  }
}






