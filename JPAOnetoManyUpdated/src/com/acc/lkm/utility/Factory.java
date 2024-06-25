package com.acc.lkm.utility;

import com.acc.lkm.dao.EmployeeDAO;
import com.acc.lkm.dao.EmployeeDAOIMPL;
import com.acc.lkm.service.EmployeeService;
import com.acc.lkm.service.EmployeeServiceImpl;

public class Factory {
	
	public static EmployeeDAO createEmployeeDAO(){
		return new EmployeeDAOIMPL();
	}
	
	public static EmployeeService createEmployeeService(){
		return new EmployeeServiceImpl();
	}

}
