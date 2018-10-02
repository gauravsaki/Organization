package com.org.product.service.impl;


import com.orgnization.sw.pojo.Order;
import com.org.product.service.OrderService;

import java.util.Date;

public class OrderServiceImp implements OrderService {

    @Override
    public Order getOrder(int orderId) {
       Order order = new Order();
       order.setOrdId(orderId);
       order.setCusId(1);
       order.setProId(1);
       order.setTime(new Date());
       return order;
    }
}
