package top.gaoch.demo;



import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Map;

public class TestDealFilter {
  public static void main(String[] args) {
    List<List<String>> filtersList = Lists.newArrayList();
    filtersList.add(Lists.newArrayList("1","2","3"));
    filtersList.add(Lists.newArrayList("4","5","6"));

    List<List<String>> result = Lists.newArrayList();
    //槽位改动
    Map<Integer, Integer> map = Maps.newHashMap();
    //待添加
    List<String> listRe = Lists.newArrayList();
    int i = 0;
    for (List<String> list : filtersList) {
      if (!CollectionUtils.isEmpty(list)) {
        List<String> listSort = Lists.newArrayList();
        //待添加一个数据范围
        int lastNum = 0;
        for (String ii : list) {
          int num = Integer.parseInt(ii);
          map.put(num, num + i);
          lastNum = num;
          listSort.add(String.valueOf(num + i));
        }
        lastNum += i + 1;
        listRe.add(String.valueOf(lastNum));
        listSort.add(String.valueOf(lastNum));
        i++;
        result.add(listSort);
      }
    }


    result = result;
    listRe = listRe;
  }
}
