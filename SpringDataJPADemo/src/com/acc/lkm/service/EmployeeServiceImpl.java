package com.acc.lkm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acc.lkm.businessbean.EmployeeBean;
import com.acc.lkm.dao.EmployeeDAO;
import com.acc.lkm.dao.EmployeeDAOWrapper;


@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDAOWrapper employeeDAOWrapper;

	@Override
	public EmployeeBean addEmployee(EmployeeBean employeeBean) throws Exception {
		// TODO Auto-generated method stub
		return employeeDAOWrapper.addEmployee(employeeBean);
	}

	/*@Override
	public EmployeeBean getEmployeeDetails(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return employeeDAOWrapper.getEmployeeDetails(id);
	}*/

	@Override
	public List<EmployeeBean> getAllEmployees() throws Exception {
		// TODO Auto-generated method stub
		return employeeDAOWrapper.getAllEmployees();
	}

	

}
