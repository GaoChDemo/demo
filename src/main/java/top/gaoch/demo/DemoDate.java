package top.gaoch.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoDate {
  public static void main(String[] args) {
    Long a = 2L;
    Long b = 1L;
    System.out.println(b > a);

  }

  public int DateCompare(String source, String traget, String type) throws Exception {
    int ret = 2;
    SimpleDateFormat format = new SimpleDateFormat(type);
    Date sourcedate = format.parse(source);
    Date tragetdate = format.parse(traget);
    ret = sourcedate.compareTo(tragetdate);
    return ret;
  }
}
