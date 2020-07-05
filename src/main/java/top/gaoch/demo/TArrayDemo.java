package top.gaoch.demo;

import java.util.ArrayList;
import java.util.List;

class TArrayA {

}


class TArrayAB extends TArrayA {

}


class TArrayABC extends TArrayAB {

}


class TArrayBB extends TArrayA {

}


public class TArrayDemo {
  public static void main(String[] args) {
    List<TArrayAB> aa = new ArrayList<TArrayAB>();


    TArrayA[] a = new TArrayAB[10];
    a[0] = new TArrayAB();
    a[1] = new TArrayABC();

    a[2] = new TArrayA();
    a[3] = new TArrayBB();
  }
}
