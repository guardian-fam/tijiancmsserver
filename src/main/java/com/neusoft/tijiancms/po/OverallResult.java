package com.neusoft.tijiancms.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 总检结论信息表
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OverallResult {
    private Integer orId;       // 总检结论项编号
    private String title;       // 总检结论项标题
    private String content;     // 总检结论项内容
    private Integer orderId;    // 所属预约编号
}