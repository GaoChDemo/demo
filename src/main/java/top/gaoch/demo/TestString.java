package top.gaoch.demo;

public class TestString {
  public static void main(String[] args) {
    eq1();
    eq2();
    eq3();
    eq4();
    eq5();
    eq6();
    eq7();
  }

  public static void eq1() { // 1
    String a = "abc";
    String b = "abc";
    System.out.println(a == b);
  }

  public static void eq2() { // 0
    String a = "abc";
    String b = new String("abc");
    System.out.println(a == b);
  }

  public static void eq3() { // 1
    String a = "abc";
    String b = new String("abc").intern();
    System.out.println(a == b);
  }

  public static void eq4() { // 0
    String a = "abc";
    String b = "def";
    String c = a + b; //sb.t
    System.out.println(c == "abcdef");
  }

  public static void eq5() { // 0
    final  String a = "abc";
    String b = "def";
    String c = a + b;
    System.out.println(c == "abcdef");
  }

  public static void eq6() { // 1
    final String a = "abc";
    final String b = "def";
    String c = a + b;
    System.out.println(c == "abcdef");
  }

  public static void eq7() { // 1
    String a = "abc";
    String b = "def";
    String c = a + b;
    c = c.intern();
    System.out.println(c == "abcdef");
  }
}
