package com.acc.lkm.service;

import com.acc.lkm.businessbean.AssetBean;
import com.acc.lkm.businessbean.EmployeeBean;
import com.acc.lkm.dao.EmployeeDAO;
import com.acc.lkm.utility.Factory;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public void getAllEmployeesAndAssetsCascade() throws Exception {
		EmployeeDAO employeeDAO=Factory.createEmployeeDao();
		try {
			employeeDAO.getAllEmployeesAndAssetsCascade();
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
	}

	@Override
	public void getAllEmployeesAndAssetinnerJOIN() throws Exception {
		EmployeeDAO employeeDAO=Factory.createEmployeeDao();
		try {
			employeeDAO.getAllEmployeesAndAssetinnerJOIN();
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
	}

	@Override
	public void getEmployeeWithAssets(String assetName) throws Exception {
		EmployeeDAO employeeDAO=Factory.createEmployeeDao();
		try {
			employeeDAO.getEmployeeWithAssets(assetName);
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
	}

	/*@Override
	public Integer insertAssetWithEmployee(EmployeeBean employeeBean, AssetBean assetBean) throws Exception {
		int employeeId=0;
		EmployeeDAO employeeDAO=Factory.createEmployeeDao();
		try {
			employeeId=employeeDAO.insertAssetWithEmployee(employeeBean, assetBean);
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return employeeId;
	}*/
	

}
