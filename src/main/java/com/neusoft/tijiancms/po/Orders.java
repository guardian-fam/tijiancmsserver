package com.neusoft.tijiancms.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

/**
 * 体检预约订单表
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Orders {
    private Integer orderId;    // 订单编号
    private Date orderDate;     // 预约日期
    private String userId;      // 客户编号
    private Integer hpId;       // 所属医院编号
    private Integer smId;       // 所属套餐编号
    private Integer state;      // 订单状态（1：未归档；2：已归档）

    // 关联对象（对应XML中的 <association> 嵌套查询）
    private Setmeal setmeal;    // 所属套餐
    private Hospital hospital;  // 所属医院
    private Users users;        // 客户信息
}