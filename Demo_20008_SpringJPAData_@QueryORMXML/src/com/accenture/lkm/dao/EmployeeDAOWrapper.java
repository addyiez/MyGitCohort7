package com.accenture.lkm.dao;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.accenture.lkm.entity.EmployeeEntity;

@Repository
@SuppressWarnings("rawtypes")
public class EmployeeDAOWrapper {

	@Autowired
	private EmployeeDAO employeeDAO;

	public List stringFunctions() throws Exception {
		List resultRet = null;
		try {
			resultRet = employeeDAO.stringFunctions();
		} catch (Exception ex) {
			throw ex;
		}
		return resultRet;
	}

	public List groupByExampleNamed() throws Exception {
		List resultRet = null;
		try {
			resultRet = employeeDAO.groupByExampleNamed();
		} catch (Exception ex) {
			throw ex;
		}
		return resultRet;
	}
	
	public List<EmployeeEntity> getEmployeeDetailsWithin(Date startDate, Date endDate) throws Exception {
	    try {
	        return employeeDAO.getEmployeeDetailsWithin(startDate, endDate);
	    } catch (Exception ex) {
	        throw ex;
	    }
	}
	
	public Integer updateEmployeeSalaryWithRole(String role, Double salary) throws Exception {
	    try {
	        return employeeDAO.updateEmployeeSalaryWithRole(role, salary);
	    } catch (Exception ex) {
	        throw ex;
	    }
	}
	
	public Integer deleteEmployeeByName(String name) throws Exception {
	    try {
	        return employeeDAO.deleteEmployeeByName(name);
	    } catch (Exception ex) {
	        throw ex;
	    }
	}

}
