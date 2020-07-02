package top.gaoch.demo;

public class DemoInteger {
  public static void main(String[] args) {
    Integer a = new Integer(3);
    Integer b = new Integer(3);
    Integer c = 3;
    int d = 3;
    System.out.println(a == b);
    System.out.println(b == c);
    System.out.println(c == d);
    System.out.println(b == d);
    System.out.println(a == d);

    Integer aa = 1000;

    Integer bb = 1000;
    System.out.println(aa == bb);
  }
}
