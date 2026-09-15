package com.neusoft.tijiancms.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 体检套餐信息表
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Setmeal {
    private Integer smId;       // 体检套餐编号
    private String name;        // 体检套餐名称
    private Integer type;       // 体检套餐类型（1：男士套餐；0：女士套餐）
    private Integer price;      // 体检套餐价格
}