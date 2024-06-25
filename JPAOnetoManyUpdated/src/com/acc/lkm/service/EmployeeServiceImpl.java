package com.acc.lkm.service;

import com.acc.lkm.businessbean.CompanyBean;
import com.acc.lkm.businessbean.EmployeeBean;
import com.acc.lkm.dao.EmployeeDAO;
import com.acc.lkm.utility.Factory;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public Integer createCompanyAndEmployeeRecords(CompanyBean companyBean1,EmployeeBean employeeBean1,EmployeeBean employeeBean2) throws Exception {
		int employeeId = 0;
		EmployeeDAO employeeDAO = Factory.createEmployeeDAO();
		try {
			employeeId = employeeDAO.createCompanyAndEmployeeRecords(companyBean1,employeeBean1,employeeBean2);
		} catch(Exception e) {
			System.out.println(e.getMessage());
			throw e;
		}
		return employeeId;
	}}

	
