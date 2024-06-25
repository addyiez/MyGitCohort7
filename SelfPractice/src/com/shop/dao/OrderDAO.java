package com.shop.dao;
import java.util.List;
import com.shop.businessbean.OrderBean;

public interface OrderDAO {
	public List<OrderBean> getAllOrders() throws Exception;
    public OrderBean getOrderById(Integer orderId) throws Exception;
    public void placeOrder(OrderBean order) throws Exception;
    public void updateOrder(OrderBean order) throws Exception;
    public void cancelOrder(Integer orderId) throws Exception;

}
