package com.shop.service;

import com.shop.dao.OrderDAO;
import com.shop.utility.Factory;
import com.shop.businessbean.OrderBean;
import java.util.List;

public class OrderServiceImpl implements OrderService {
    private OrderDAO orderDAO = Factory.createOrderDAO();

    @Override
    public List<OrderBean> getAllOrders() throws Exception {
        return orderDAO.getAllOrders();
    }

    @Override
    public OrderBean getOrderById(Integer orderId) throws Exception {
        return orderDAO.getOrderById(orderId);
    }

    @Override
    public void placeOrder(OrderBean order) throws Exception {
        orderDAO.placeOrder(order);
    }

    @Override
    public void updateOrder(OrderBean order) throws Exception {
        orderDAO.updateOrder(order);
    }

    @Override
    public void cancelOrder(Integer orderId) throws Exception {
        orderDAO.cancelOrder(orderId);
    }
}
