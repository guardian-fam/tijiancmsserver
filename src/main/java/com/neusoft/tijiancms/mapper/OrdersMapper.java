package com.neusoft.tijiancms.mapper;

import com.neusoft.tijiancms.dto.OrdersPageRequestDto;
import com.neusoft.tijiancms.po.Orders;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface OrdersMapper {

    // ================= 复杂多表关联查询（使用 XML） =================
    int getOrdersCount(OrdersPageRequestDto dto);
    List<Orders> listOrders(OrdersPageRequestDto dto);

    // ================= 单表操作（使用注解） =================

    @Select("select * from orders where orderId = #{orderId}")
    Orders getOrdersById(Integer orderId);

    /**
     * 更新预约状态（单表 - 注解）
     * 直接传 Orders 对象，不加 @Param，SQL中直接使用 #{orderId} 和 #{state}
     */
    @Update("update orders set state = #{state} where orderId = #{orderId}")
    int updateOrdersState(Orders orders);

    @Insert("insert into orders(orderDate, userId, hpId, smId, state) " +
            "values(#{orderDate}, #{userId}, #{hpId}, #{smId}, #{state})")
    @Options(useGeneratedKeys = true, keyProperty = "orderId")
    int saveOrders(Orders orders);

    @Delete("delete from orders where orderId = #{orderId}")
    int removeOrders(Orders orders);
}