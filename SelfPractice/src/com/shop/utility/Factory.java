package com.shop.utility;

import com.shop.dao.ProductDAO;
import com.shop.dao.ProductDAOImpl;
import com.shop.dao.CustomerDAO;
import com.shop.dao.CustomerDAOImpl;
import com.shop.dao.OrderDAO;
import com.shop.dao.OrderDAOImpl;

public class Factory {
    public static ProductDAO createProductDAO() {
        return new ProductDAOImpl();
    }

    public static CustomerDAO createCustomerDAO() {
        return new CustomerDAOImpl();
    }

    public static OrderDAO createOrderDAO() {
        return new OrderDAOImpl();
    }
}
