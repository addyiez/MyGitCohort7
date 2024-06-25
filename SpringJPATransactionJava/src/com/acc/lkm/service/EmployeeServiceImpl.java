package com.acc.lkm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acc.lkm.businessbean.EmployeeBean;
import com.acc.lkm.dao.EmployeeDAO;
import com.acc.lkm.exceptions.InvalidUpdateOperationException;
@Service
public class EmployeeServiceImpl implements EmployeeService{
@Autowired
private EmployeeDAO employeeDAO;
	@Override
	public Integer addEmployee(EmployeeBean employeeBean) throws Exception {
		// TODO Auto-generated method stub
		return employeeDAO.addEmployee(employeeBean);
		
	}

	@Override
	public EmployeeBean getEmployeeDetails(Integer id) throws Exception {
		// TODO Auto-generated method stub
		EmployeeBean emp= employeeDAO.getEmployeeDetails(id);
		if(emp==null) {
			throw new InvalidUpdateOperationException();
		}
		return emp;
	}

}
