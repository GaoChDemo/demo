package top.gaoch.demo;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerDemo {
  public static void main(String[] args) {
    AtomicInteger atomicInteger = new AtomicInteger(1);
    System.out.println(atomicInteger.incrementAndGet());
    System.out.println(atomicInteger.getAndIncrement());
    System.out.println(atomicInteger.get());
  }
}
