package com.neusoft.tijiancms.dto;

import com.neusoft.tijiancms.po.Orders;
import lombok.Data;
import java.util.List;

/**
 * 体检预约分页查询响应 DTO
 */
@Data
public class OrdersPageResponseDto {
    private Integer total;          // 总记录数
    private List<Orders> list;      // 当前页数据
}