package com.neusoft.tijiancms.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 体检报告检查项明细表
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CiDetailedReport {
    private Integer cidrId;         // 检查项明细报告编号
    private String name;            // 检查项明细名称
    private String unit;            // 检查项明细单位
    private Double minrange;        // 正常值范围最小值
    private Double maxrange;        // 正常值范围最大值
    private String normalValue;     // 正常值（非数字型）
    private String normalValueString; // 验证范围说明文字
    private Integer type;           // 明细类型
    private String value;           // 检查项具体到数值
    private Integer isError;        // 此项是否异常
    private Integer ciId;           // 所属检查项报告编号
    private Integer orderId;        // 所属预约编号
}