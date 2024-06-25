package com.acc.lkm.service;

import java.util.List;

import com.acc.lkm.businessbean.EmployeeBean;

public interface EmployeeService {
	EmployeeBean addEmployee(EmployeeBean employeeBean)throws Exception;
	//EmployeeBean getEmployeeDetails(Integer id)throws Exception;
	List<EmployeeBean>getAllEmployees()throws Exception;
}
