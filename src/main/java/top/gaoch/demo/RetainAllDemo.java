package top.gaoch.demo;

import com.google.common.collect.Sets;

import java.util.Set;

public class RetainAllDemo {
  public static void main(String[] args) {
    Set<String> s1 = Sets.newHashSet("1","2");
    Set<String> s2 = Sets.newHashSet("1");
    System.out.println(s1.retainAll(s2));


    System.out.println(s1.size());
  }
}
