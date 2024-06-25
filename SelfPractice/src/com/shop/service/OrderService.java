package com.shop.service;

import com.shop.businessbean.OrderBean;
import java.util.List;

public interface OrderService {
    public List<OrderBean> getAllOrders() throws Exception;
    public OrderBean getOrderById(Integer orderId) throws Exception;
    public void placeOrder(OrderBean order) throws Exception;
    public void updateOrder(OrderBean order) throws Exception;
    public void cancelOrder(Integer orderId) throws Exception;
}