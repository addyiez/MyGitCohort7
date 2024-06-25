package com.accenture.lkm.service;

import java.util.Date;
import java.util.List;

import com.accenture.lkm.entity.EmployeeEntity;

@SuppressWarnings("rawtypes")
public interface EmployeeService {
	List stringFunctions()throws Exception;
	List groupByExampleNamed()throws Exception;
	List<EmployeeEntity> getEmployeeDetailsWithin(Date startDate, Date endDate) throws Exception;
	Integer updateEmployeeSalaryWithRole(String role, Double salary) throws Exception;
	Integer deleteEmployeeByName(String name) throws Exception;
	
}
