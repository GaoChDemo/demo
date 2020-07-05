package top.gaoch.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
public enum  StudentEnum {
  CollegeStudent("dxs","demo.CollegeStudent"),
  JuniorSchoolStudent("czs","demo.JuniorSchoolStudent"),
  Pupil("xxs","demo.Pupil");

  @Getter
  private String info;
  @Getter
  private String clazz;

  public static Map<String,String> getAllStatusCode() {
    Map<String,String> map = new HashMap<String, String>() ;
    for (StudentEnum status : values()) {
      map.put(status.getInfo(),status.getClazz()) ;
    }
    return map;
  }
}
