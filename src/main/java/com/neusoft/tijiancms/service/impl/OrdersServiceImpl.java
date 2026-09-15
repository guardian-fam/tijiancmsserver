package com.neusoft.tijiancms.service.impl;

import com.neusoft.tijiancms.dto.OrdersPageRequestDto;
import com.neusoft.tijiancms.dto.OrdersPageResponseDto;
import com.neusoft.tijiancms.mapper.OrdersMapper;
import com.neusoft.tijiancms.po.Orders;
import com.neusoft.tijiancms.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    private OrdersMapper ordersMapper;

    @Override
    public OrdersPageResponseDto listOrders(OrdersPageRequestDto dto) {
        // 计算 limit 的起始行：如果你的 DTO 中传的是页码，则需在此处换算
        // 这里假设前端直接传 beginNum 和 maxPageNum，如果不是，自行调整
        if (dto.getBeginNum() == null) dto.setBeginNum(0);
        if (dto.getMaxPageNum() == null) dto.setMaxPageNum(10);

        int total = ordersMapper.getOrdersCount(dto);
        List<Orders> list = ordersMapper.listOrders(dto);

        OrdersPageResponseDto response = new OrdersPageResponseDto();
        response.setTotal(total);
        response.setList(list);
        return response;
    }

    @Override
    public Orders getOrdersById(Orders orders) {
        return ordersMapper.getOrdersById(orders.getOrderId());
    }

    @Override
    public int updateOrdersState(Orders orders) {
        return ordersMapper.updateOrdersState(orders);
    }

    @Override
    public int saveOrders(Orders orders) {
        return ordersMapper.saveOrders(orders);
    }

    @Override
    public int removeOrders(Orders orders) {
        return ordersMapper.removeOrders(orders);
    }
}