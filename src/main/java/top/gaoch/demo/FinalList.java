package top.gaoch.demo;



import com.google.common.collect.Lists;
import org.apache.commons.collections4.ListUtils;

import java.util.ArrayList;
import java.util.List;

public class FinalList {
  public static void main(String[] args) {
    final List strList = new ArrayList<>();
    strList.add("Hello");
    strList.add("world");
    List unmodifiableStrList  = ListUtils.unmodifiableList(Lists.newArrayList("hello", "world"));
    unmodifiableStrList.add("again"); //抛出异常 java.lang.UnsupportedOperationException


  }
}
