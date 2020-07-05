package top.gaoch.jol;

import org.openjdk.jol.info.ClassLayout;
import org.openjdk.jol.info.GraphLayout;
import sun.misc.VMSupport;

import java.util.ArrayList;
import java.util.List;

public class JOLDemo {
  public static void main(String[] args) {
    Object o = new Object();

    int size = 10;
    List<Integer> list = new ArrayList<Integer>(size);
    for (int i = 0; i < size; i++) {
      list.add(i);
    }
    //虚拟机信息
    System.out.println("虚拟机信息");
    System.out.println(VMSupport.getVMTemporaryDirectory());
    //打印类内部的占用
    System.out.println("打印类内部的占用");
    System.out.println(ClassLayout.parseClass(ArrayList.class).toPrintable());
    //打印实例内部的占用
    System.out.println("打印实例内部的占用");
    System.out.println(ClassLayout.parseClass(ArrayList.class).toPrintable(list));
    //打印实例外部的占用
    System.out.println("打印实例外部的占用");
    System.out.println(GraphLayout.parseInstance(list).toPrintable());
    //打印实例各个依赖的占用,并汇总
    System.out.println("打印实例各个依赖的占用,并汇总");
    System.out.println(GraphLayout.parseInstance(list).toFootprint());


    Data data = new Data();
    System.out.println(ClassLayout.parseInstance(data).toPrintable(data));

    Object[] p = new Object[3];
    p[0] = new Object();
    p[1] = new Object();
    p[2] = new Object();

    System.out.println(ClassLayout.parseInstance(p).toPrintable(p));
  }
}
