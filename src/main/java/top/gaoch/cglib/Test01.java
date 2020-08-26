package top.gaoch.cglib;

public class Test01 {
  public static void main(String[]args){
    UserServiceImpl userserviceimle=new UserServiceImpl();
    //通过业务接口来接受代理对象
    UserService userservice=(UserService)new CglibProxy().createProxyInstance(userserviceimle);
    System.out.println(userservice.getClass());
    userservice.saveUser();
  }
}
