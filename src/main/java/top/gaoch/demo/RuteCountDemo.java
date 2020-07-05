package top.gaoch.demo;

public class RuteCountDemo {
  public static void main(String[] args) {
    System.out.println(count(4,5));
  }

  public static int count(int m, int n) {
    if (m == 1 || n == 1) return 1;

    return count(m - 1, n) + count(m , n-1);
  }
}
