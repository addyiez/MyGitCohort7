package com.acc.lkm.UiController;

import java.util.Date;

import com.acc.lkm.businessbean.AssetBean;
import com.acc.lkm.businessbean.EmployeeBean;
import com.acc.lkm.service.EmployeeService;
import com.acc.lkm.utility.Factory;
import com.acc.lkm.utility.JPAUtility;

public class UITest {

	public static void main(String[] args) {
		try {
			insertAssetWithEmployee();
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}finally{
			JPAUtility.closeEntityManagerFactory();
		}

	}

	private static void insertAssetWithEmployee() {
		int employeeId=0;
		try {
			EmployeeService employeeService=Factory.createEmployeeService();
			EmployeeBean employee=new EmployeeBean();
			//Persisting the Employee Records
			employee.setEmployeeName("Shekhar Singh");
			employee.setRole("AM");
			employee.setSalary(12000.00);
			employee.setInsertTime(new Date());
			//Persisting the Asset Records
			AssetBean assetBean=new AssetBean();
			assetBean.setAssetName("Laptop");
			assetBean.setAssetBrandName("DELL");
			assetBean.setValidity(3);
			employeeId=employeeService.insertAssetWithEmployee(employee, assetBean);
			System.out.println("Employee Inserted Successfully"+employeeId);
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
	}

}
