package com.acc.lkm.dao;

import com.acc.lkm.businessbean.DepartmentBean;
import com.acc.lkm.businessbean.EmployeeBean;

public interface EmployeeDAO {
Integer addEmployee(EmployeeBean employeeBean) throws Exception;
Integer addDepartment(DepartmentBean departmentBean) throws Exception;
//EmployeeBean getEmployeeDetails(Integer id)throws Exception;
}
