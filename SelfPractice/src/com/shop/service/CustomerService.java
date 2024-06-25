package com.shop.service;

import com.shop.businessbean.CustomerBean;
import java.util.List;

public interface CustomerService {
    public List<CustomerBean> getAllCustomers() throws Exception;
    public CustomerBean getCustomerById(Integer customerId) throws Exception;
    public void addCustomer(CustomerBean customer) throws Exception;
    public void updateCustomer(CustomerBean customer) throws Exception;
    public void deleteCustomer(Integer customerId) throws Exception;
}

