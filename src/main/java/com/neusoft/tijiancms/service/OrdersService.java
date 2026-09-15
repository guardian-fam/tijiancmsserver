package com.neusoft.tijiancms.service;

import com.neusoft.tijiancms.dto.OrdersPageRequestDto;
import com.neusoft.tijiancms.dto.OrdersPageResponseDto;
import com.neusoft.tijiancms.po.Orders;

public interface OrdersService {
    public OrdersPageResponseDto listOrders(OrdersPageRequestDto dto);
    public Orders getOrdersById(Orders orders);
    public int updateOrdersState(Orders orders);
    public int saveOrders(Orders orders);
    public int removeOrders(Orders orders);
}