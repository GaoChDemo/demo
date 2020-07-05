package top.gaoch.cglib;


public class UserServiceImpl implements UserService{

  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void saveUser() {
    System.out.println("保存用户");
  }
  public void updateUser() {
    System.out.println("修改用户");
  }
}