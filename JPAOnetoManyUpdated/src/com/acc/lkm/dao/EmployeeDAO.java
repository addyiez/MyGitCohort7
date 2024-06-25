package com.acc.lkm.dao;

import com.acc.lkm.businessbean.CompanyBean;
import com.acc.lkm.businessbean.EmployeeBean;

public interface EmployeeDAO {
	
	public Integer createCompanyAndEmployeeRecords(CompanyBean companyBean1,EmployeeBean employeeBean1,EmployeeBean employeeBean2) throws Exception ;

	
	
}
