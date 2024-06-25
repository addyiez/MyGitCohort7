package com.acc.lkm.service;

import com.acc.lkm.businessbean.DepartmentBean;
import com.acc.lkm.businessbean.EmployeeBean;

public interface EmployeeService {
	Integer addEmployeeAndDepartment(EmployeeBean employeeBean,DepartmentBean departmentBean) throws Exception;
	//Integer addDepartment(DepartmentBean departmentBean) throws Exception;
	//EmployeeBean getEmployeeDetails(Integer id)throws Exception;
}
