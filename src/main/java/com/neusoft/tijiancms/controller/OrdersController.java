package com.neusoft.tijiancms.controller;

import com.neusoft.tijiancms.dto.OrdersPageRequestDto;
import com.neusoft.tijiancms.dto.OrdersPageResponseDto;
import com.neusoft.tijiancms.po.Orders;
import com.neusoft.tijiancms.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrdersController {

    @Autowired
    private OrdersService ordersService;

    @RequestMapping( "/listOrders")
    public OrdersPageResponseDto listOrders(@RequestBody OrdersPageRequestDto dto) {
        return ordersService.listOrders(dto);
    }

    @RequestMapping( "/getOrdersById")
    public Orders getOrdersById(@RequestBody Orders orders) {
        return ordersService.getOrdersById(orders);
    }

    @RequestMapping("/updateOrdersState")
    public int updateOrdersState(@RequestBody Orders orders) {
        return ordersService.updateOrdersState(orders);
    }

    @RequestMapping("/saveOrders")
    public int saveOrders(@RequestBody Orders orders) {
        return ordersService.saveOrders(orders);
    }

    @RequestMapping("/removeOrders")
    public int removeOrders(@RequestBody Orders orders) {
        return ordersService.removeOrders(orders);
    }
}