package com.accenture.lkm.service;

import java.util.Date;
import java.util.List;

import com.accenture.lkm.businessbean.CustomerBean;

public interface CustomerService {
	Integer addCustomer(CustomerBean customer) throws Exception;
	List<CustomerBean> getCustomerDetails() throws Exception;
}
