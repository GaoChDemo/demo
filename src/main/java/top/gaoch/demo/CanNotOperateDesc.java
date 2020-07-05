package top.gaoch.demo;

import lombok.Data;

@Data
public class CanNotOperateDesc {
  private String order;//不可以作为排序字段的原因
  private String filter;//不可以作为数据范围的原因
  private String group;//不可以作为指标的原因
  private String aggr;//不可以作为维度的原因
}
