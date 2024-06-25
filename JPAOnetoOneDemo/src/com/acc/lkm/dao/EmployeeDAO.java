package com.acc.lkm.dao;

import com.acc.lkm.businessbean.AssetBean;
import com.acc.lkm.businessbean.EmployeeBean;

public interface EmployeeDAO {
	public Integer insertAssetWithEmployee(EmployeeBean employeeBean,AssetBean assetBean)throws Exception;
}
