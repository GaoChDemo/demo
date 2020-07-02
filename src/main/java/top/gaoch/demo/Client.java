package top.gaoch.demo;

public class Client {
  public static void main(String[] args) {
    int i = 80;
    String s1 = String.valueOf(i<100?90:100);
    String s2 = String.valueOf(i<100?90:100.0);
    System.out.println("s1:"+s1+" ,s2:"+s2);
    System.out.println(s1.equals(s2));
  }
}
