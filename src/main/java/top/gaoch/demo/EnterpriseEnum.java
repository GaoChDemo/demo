package top.gaoch.demo;

public enum EnterpriseEnum {
  UNKNOWN, //未知   //默认走商机2.0 然后报错提醒开发者
  OLD_OPPORTUNITY, //老企业 还在使用老商机 没有切换新商机  // 使用老商机
  OLD_NEWOPPORTUNITY, //老企业 还在使用新商机 已经切换新商机 // 使用商机2.0
  NEW_NEWOPPORTUNITY; //新企业 还在使用新商机 已经切换新商机 // 使用商机2.0

}
