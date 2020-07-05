package top.gaoch.demo;



import org.apache.commons.lang3.StringUtils;

import java.util.Map;

public class InnerCommandContext {
  public Student getInstance(String info){
    Map<String, String> allStatusCode = StudentEnum.getAllStatusCode();
    String clazz = allStatusCode.get(info);
    Student student = null;
    try{
      if(StringUtils.isEmpty(clazz)){
        clazz = Pupil.class.getName();
      }
      student = (Student) Class.forName(clazz).newInstance();
    } catch (Exception e) {
      e.printStackTrace();
    }

    return student;
  }
}
