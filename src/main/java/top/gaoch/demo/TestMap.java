package top.gaoch.demo;

import com.google.common.collect.Maps;

import java.util.Map;

public class TestMap {
  public static void main(String[] args) {
    Map<String, String> map = Maps.newHashMap();

    String orDefault = map.getOrDefault(null, null);

    System.out.println(orDefault);
  }
}
