package com.acc.lkm.service;

import com.acc.lkm.businessbean.AssetBean;
import com.acc.lkm.businessbean.EmployeeBean;

public interface EmployeeService {
	public void getAllEmployeesAndAssetsCascade()throws Exception;
	public void getAllEmployeesAndAssetinnerJOIN()throws Exception;
	public void getEmployeeWithAssets(String assetName)throws Exception;
//public Integer insertAssetWithEmployee(EmployeeBean employeeBean,AssetBean assetBean)throws Exception;
}
