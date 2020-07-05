package top.gaoch.demo;

import lombok.Data;

@Data
class SynchronizedDemoData {
  private int i ;
}


public class SynchronizedDemo {
  public static void main(String[] args) {
    SynchronizedDemoData synchronizedDemoData = new SynchronizedDemoData();
//    synchronized ( )synchronizedDemoData
  }
}
