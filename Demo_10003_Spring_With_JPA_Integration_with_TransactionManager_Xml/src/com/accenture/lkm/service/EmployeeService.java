package com.accenture.lkm.service;

import java.util.Date;
import java.util.List;

import com.accenture.lkm.business.bean.EmployeeBean;

public interface EmployeeService {
    // CRUD operations
    Integer addEmployee(EmployeeBean employeeBean) throws Exception;
    EmployeeBean getEmployeeDetails(Integer id) throws Exception;
    EmployeeBean updateEmployeeDetails(EmployeeBean employeeBean) throws Exception;
    EmployeeBean deleteEmployeeDetails(Integer id) throws Exception;
    List<EmployeeBean> getEmployeeList() throws Exception;

    // Specialized operations
//    List<EmployeeBean> getEmployeeDetailsWithin(Date startDate, Date endDate) throws Exception;
//    Integer updateEmployeeSalaryWithRole(String role, Double salary) throws Exception;
//    Integer deleteEmployeeByName(String name) throws Exception;
    
    Integer updateEmployeeSalaryWithRole(String role, Double newSalary);

    Integer deleteEmployeeByName(String name);

    List<EmployeeBean> getEmployeeDetailsWithin(Date startDate, Date endDate);
}
