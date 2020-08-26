package top.gaoch.cglib;


import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxy implements MethodInterceptor {

  private  Object targetObj;

  public Object createProxyInstance( Object targetObj) {
    this.targetObj = targetObj;
    Enhancer enhancer = new Enhancer();
    enhancer.setSuperclass(this.targetObj.getClass()); // 设置代理目标
    enhancer.setCallback(this); // 设置回调
    return enhancer.create();

  }


  public Object intercept(Object arg0, Method method, Object[] arg2, MethodProxy arg3) throws Throwable {
    // TODO Auto-generated method stub
    //获得目标对象的get方法
    Method getmethod = this.targetObj.getClass().getMethod("getName", null);
    //通过反射获得调用方法的方法值
    Object name = getmethod.invoke(this.targetObj, null);
    Object obj = null;
    if(name!=null) {
      //通过调用目标对象的
      obj = method.invoke(this.targetObj, arg2);

    }else {
      System.out.println("您还没有登录！");
    }
    return obj;
  }

}
