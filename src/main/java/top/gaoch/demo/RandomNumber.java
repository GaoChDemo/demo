package top.gaoch.demo;

public class RandomNumber {
  public static void main(String[] args) {
    String[] split = "OBJECT_EXPORT_PERMISSION_PREFIX-RequestContextManager.getEi()-RequestContextManager.getUserId()-".split("-");

    String ei = split[1];
    String uid = split[2];
    String objName = split[3];
  }

  public static int f() {
    Integer i = 0;
    try {++i;

      return ++i;} finally {
      ++i;
    }
  }
}
