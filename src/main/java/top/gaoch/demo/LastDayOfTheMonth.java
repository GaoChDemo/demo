package top.gaoch.demo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class LastDayOfTheMonth {

  public static void main(String[] args) {
    Calendar calendar = Calendar.getInstance();
    Date date = new Date();
    Calendar calendarLast = Calendar.getInstance();
    calendarLast.setTime(date);
    calendarLast.set(Calendar.DAY_OF_MONTH, 1);// 设定当前时间为每月一号
    // 当前日历的天数上-1变成最大值 , 此方法不会改变指定字段之外的字段
    calendarLast.roll(Calendar.DAY_OF_MONTH, -1);
    int dayOfMonthLast = calendarLast.get(Calendar.DAY_OF_MONTH);
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    System.out.println(sdf.format(calendarLast.getTime()));
    System.out.println(dayOfMonthLast);

    int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
    System.out.println(dayOfMonth);
  }
}
