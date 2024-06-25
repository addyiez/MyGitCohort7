package com.accenture.lkm.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.lkm.dao.EmployeeDAOWrapper;
import com.accenture.lkm.entity.EmployeeEntity;

@Service
@SuppressWarnings("rawtypes")
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private  EmployeeDAOWrapper employeeDAOWrapper;

	public List stringFunctions() throws Exception{
		return employeeDAOWrapper.stringFunctions();
	}

	
	public List groupByExampleNamed()throws Exception {
		return employeeDAOWrapper.groupByExampleNamed();
	}
	
	public List<EmployeeEntity> getEmployeeDetailsWithin(Date startDate, Date endDate) throws Exception {
	    return employeeDAOWrapper.getEmployeeDetailsWithin(startDate, endDate);
	}
	
	public Integer updateEmployeeSalaryWithRole(String role, Double salary) throws Exception {
	    return employeeDAOWrapper.updateEmployeeSalaryWithRole(role, salary);
	}
	
	public Integer deleteEmployeeByName(String name) throws Exception {
	    return employeeDAOWrapper.deleteEmployeeByName(name);
	}
}
