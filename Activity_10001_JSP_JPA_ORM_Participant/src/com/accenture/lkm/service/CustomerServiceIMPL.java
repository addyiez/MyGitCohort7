package com.accenture.lkm.service;

import java.util.Date;
import java.util.List;

import com.accenture.lkm.businessbean.CustomerBean;
import com.accenture.lkm.dao.CustomerDAO;
import com.accenture.lkm.utility.Factory;

public class CustomerServiceIMPL implements CustomerService {
	
	public Integer addCustomer(CustomerBean customer) throws Exception {

		int custID = 0;
		try {

			CustomerDAO customerDAO = Factory.createCustomerDAO();

			custID=customerDAO.addCustomer(customer);

		} catch (Exception exception) {
			throw exception;
		}

		return custID;

	}

	
	
	public List<CustomerBean> getCustomerDetails() throws Exception{
		List<CustomerBean> list=null;
		try {
			CustomerDAO cutomerDAO = Factory.createCustomerDAO();
			
			list= cutomerDAO.getCustomerDetails();
			
		} catch (Exception exception) {
			throw exception;
		}
		return list;
	}
	
	
	
	public Integer updateCustomerBillByName(String name, Double bill)throws Exception{
		Integer ret=null;
		try {
			CustomerDAO cutomerDAO = Factory.createCustomerDAO();
		
			
			// your code goes here
			
		} catch (Exception exception) {
			throw exception;
		}
		return ret;
	}

}
