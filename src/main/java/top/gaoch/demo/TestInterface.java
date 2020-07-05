package top.gaoch.demo;

import java.util.Random;

public class TestInterface {
  public static void main(String[] args) {
    System.out.println(RandemTest.RANDOM.nextInt(10));
    System.out.println(RandemTest.RANDOM_INT);
    System.out.println(RandemTest.RANDOM_LONG);


    System.out.println("---------------------");

    System.out.println(RandemTest.RANDOM.nextInt(10));
    System.out.println(RandemTest.RANDOM_INT);
    System.out.println(RandemTest.RANDOM_LONG);

    System.out.println("---------------------");


    System.out.println(RandemTest.RANDOM.nextInt(10));
    System.out.println(RandemTest.RANDOM_INT);
    System.out.println(RandemTest.RANDOM_LONG);
  }
}


interface RandemTest {
  Random RANDOM = new Random(12);
  int RANDOM_INT = RANDOM.nextInt();
  long RANDOM_LONG = RANDOM.nextLong();
}
