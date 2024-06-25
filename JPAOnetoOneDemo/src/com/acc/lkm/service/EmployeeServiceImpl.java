package com.acc.lkm.service;

import com.acc.lkm.businessbean.AssetBean;
import com.acc.lkm.businessbean.EmployeeBean;
import com.acc.lkm.dao.EmployeeDAO;
import com.acc.lkm.utility.Factory;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public Integer insertAssetWithEmployee(EmployeeBean employeeBean, AssetBean assetBean) throws Exception {
		int employeeId=0;
		EmployeeDAO employeeDAO=Factory.createEmployeeDao();
		try {
			employeeId=employeeDAO.insertAssetWithEmployee(employeeBean, assetBean);
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return employeeId;
	}

}
