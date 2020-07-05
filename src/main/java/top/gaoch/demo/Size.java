package top.gaoch.demo;


import com.carrotsearch.sizeof.RamUsageEstimator;
import top.gaoch.proxy.DynaProxyHello;

public class Size {
  public static void main(String[] args) {
    Boolean aBoolean = Boolean.TRUE;
    System.out.println("Boolean : " + RamUsageEstimator.sizeOf(aBoolean));

    boolean b = Boolean.TRUE;
    System.out.println("boolean : " + RamUsageEstimator.sizeOf(b));

    Integer integer = 1000;
    System.out.println("Integer : " + RamUsageEstimator.sizeOf(integer));

    int i = 1000;
    System.out.println("int : " + RamUsageEstimator.sizeOf(i));

    System.out.println("EnterpriseOpportunityStatusEnum : " + RamUsageEstimator.sizeOf(EnterpriseOpportunityStatusEnum.NEW_NEWOPPORTUNITY));

    System.out.println("EnterpriseEnum : " + RamUsageEstimator.sizeOf(EnterpriseEnum.NEW_NEWOPPORTUNITY));

    A a = new A();
    System.out.println("A : " + RamUsageEstimator.sizeOf(a));

    DynaProxyHello dynaProxyHello = new DynaProxyHello();
    System.out.println("DynaProxyHello : " + RamUsageEstimator.sizeOf(dynaProxyHello));
  }
}
