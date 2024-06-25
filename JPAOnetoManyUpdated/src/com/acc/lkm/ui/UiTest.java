package com.acc.lkm.ui;

import com.acc.lkm.businessbean.CompanyBean;
import com.acc.lkm.businessbean.EmployeeBean;
import com.acc.lkm.service.EmployeeService;
import com.acc.lkm.utility.Factory;
import com.acc.lkm.utility.JPAUtility;

public class UiTest {

	public static void main(String[] args) {
		try {
			createCompanyAndEmployeeRecords();
			
			
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			JPAUtility.closeEntityManagerFactory();
		}
	}

	static void createCompanyAndEmployeeRecords() {
		try {
			EmployeeService service = Factory.createEmployeeService();

			EmployeeBean employee1 = new EmployeeBean();
			employee1.setEmployeeName("Samar");
			employee1.setRole("Team Lead");

			EmployeeBean employee2 = new EmployeeBean();
			employee2.setEmployeeName("Amal");
			employee2.setRole("HR Lead");
			
			CompanyBean companyBean = new CompanyBean();
			companyBean.setCompanyName("Accenture");

			service.createCompanyAndEmployeeRecords(companyBean,employee1,employee2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	

}
