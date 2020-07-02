package top.gaoch.demo;

import java.math.BigDecimal;

public class OutIndexDemo {
  public static void main(String[] args) {

    BigDecimal bigDecimal = new BigDecimal(100l);
    BigDecimal bigDecimalss = new BigDecimal(0.8);
    System.out.println(bigDecimal.multiply(bigDecimalss));


    String s = "trade_time";
    String s1 = "payment_customer.payment_time";

    String[] split = s.split("\\.");

    System.out.println(split.length);

    String[] split1 = s1.split("\\.");

    System.out.println(split1.length);


  }
}


class BusinessObject {
  public int isMainObject;

  public boolean isMainObject() {
    return isMainObject == 1 ? true : false;
  }

  public void setIsMainObject(int isMainObject) {
    this.isMainObject = isMainObject;
  }
}