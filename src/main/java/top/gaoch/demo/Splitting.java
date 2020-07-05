package top.gaoch.demo;

public class Splitting {
  public static String knights = "as, ,qwe, ,ert, a,sd re,r, fds, sfd ffp sd fs";

  public static void split (String regex) {
    for (String item : knights.split(regex)) {
      System.out.print(String.format("[%s]",item));
    }
    System.out.println();
  }
  public static void main(String[] args) {
    split(" ");
    split("\\W");
    split("p\\W");

  }
}
