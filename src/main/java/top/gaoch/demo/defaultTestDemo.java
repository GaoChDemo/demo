package top.gaoch.demo;

interface IDefaultA {
  default int test1() {
    return 0;
  }

  default int test2() {
    return 0;
  }
}


abstract class ADefaultA implements IDefaultA {
  @Override
  public int test1() {
    return 0;
  }

  @Override
  public int test2() {
    return 0;
  }
}


public class defaultTestDemo extends ADefaultA{
  @Override
  public int test1() {
    return super.test1();
  }
}
