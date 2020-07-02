package top.gaoch.demo;

import java.util.ArrayList;
import java.util.LinkedList;

public class DemoExtends extends AA{

  public void sout(){
    System.out.println("222");
  }

  public void sout3(){
    System.out.println("133311");
  }

  public static void main(String[] args) {
    AA d = new AA();
    d.sout();

    ArrayList list = new ArrayList();
    list.add(1);
    list.add(2);
    System.out.println(list.remove(0));
    System.out.println(list.remove(0));

    LinkedList list1 = new LinkedList();
    list1.add(1);
    list1.add(2);
    System.out.println(list1.remove(0));
    System.out.println(list1.remove(0));

  }
}


class AA{
  protected void sout(){
    System.out.println("111");
  }
}
