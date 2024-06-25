package com.accenture.lkm.dao;

import java.util.Date;
import java.util.List;

import com.accenture.lkm.businessbean.CustomerBean;

public interface CustomerDAO {
	
	Integer addCustomer(CustomerBean customer) throws Exception;
	List<CustomerBean> getCustomerDetails()throws Exception;

}
