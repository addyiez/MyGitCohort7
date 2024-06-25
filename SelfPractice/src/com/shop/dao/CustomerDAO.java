package com.shop.dao;
import java.util.List;
import com.shop.businessbean.CustomerBean;

public interface CustomerDAO {
	public List<CustomerBean> getAllCustomers() throws Exception;
    public CustomerBean getCustomerById(Integer customerId) throws Exception;
    public void addCustomer(CustomerBean customer) throws Exception;
    public void updateCustomer(CustomerBean customer) throws Exception;
    public void deleteCustomer(Integer customerId) throws Exception;

}
