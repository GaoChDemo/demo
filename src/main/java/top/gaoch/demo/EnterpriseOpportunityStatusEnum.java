package top.gaoch.demo;

public enum EnterpriseOpportunityStatusEnum {
  UNKNOWN(0), //未知   //默认走商机2.0 然后报错提醒开发者
  OLD_OPPORTUNITY(1), //老企业 还在使用老商机 没有切换新商机  // 使用老商机
  OLD_NEWOPPORTUNITY(2), //老企业 还在使用新商机 已经切换新商机 // 使用商机2.0
  NEW_NEWOPPORTUNITY(3); //新企业 还在使用新商机 已经切换新商机 // 使用商机2.0


  private Integer code;

  EnterpriseOpportunityStatusEnum(Integer code) {
    this.code = code;
  }

  public Integer getCode() {
    return code;
  }

  public static EnterpriseOpportunityStatusEnum getEnumByCode(Integer code){
    if(null == code) {
      return UNKNOWN;
    }

    for(EnterpriseOpportunityStatusEnum enterpriseOpportunityStatusEnum : EnterpriseOpportunityStatusEnum.values()){
      if(enterpriseOpportunityStatusEnum.code.equals(code)){
        return enterpriseOpportunityStatusEnum;
      }
    }
    return UNKNOWN;
  }

}
