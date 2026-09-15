package com.neusoft.tijiancms.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 体检报告检查项目信息表
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CiReport {
    private Integer cirId;      // 检查项报告主键
    private Integer ciId;       // 检查项编号
    private String ciName;      // 检查项名称
    private Integer orderId;    // 所属预约编号
}