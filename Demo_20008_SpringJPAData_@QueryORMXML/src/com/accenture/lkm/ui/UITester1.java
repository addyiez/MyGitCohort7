package com.accenture.lkm.ui;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.accenture.lkm.entity.EmployeeEntity;
import com.accenture.lkm.service.EmployeeService;
@SuppressWarnings("rawtypes")
public class UITester1 {

	public static void main(String[] args) {
		
		EmployeeService employeeServiceIMPL=null;
		try{
			
			ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/accenture/lkm/resources/cst-main-config.xml");
			employeeServiceIMPL = (EmployeeService) applicationContext.getBean("employeeServiceImpl");
		
		
			//getAllEmployeeDetails1(employeeServiceIMPL);

			//getAllEmployeeDetails2(employeeServiceIMPL);
//			 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//			// Call the new methods
//			Date startDate = sdf.parse("2016-01-27");// Set the start date
//			Date endDate = sdf.parse("2016-01-28");// Set the end date
//			getEmployeeDetailsWithinTest(employeeServiceIMPL, startDate, endDate);

//			String role = "Sr.Analyst";// Set the role
//			Double salary = 200000.00;// Set the new salary
//			updateEmployeeSalaryWithRoleTest(employeeServiceIMPL, role, salary);
//
			String name = "James";// Set the name
			deleteEmployeeByNameTest(employeeServiceIMPL, name);
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
	}

	

	public static void getAllEmployeeDetails1(EmployeeService serviceImpl) {

		try {

			List listEmployeeBean = serviceImpl.groupByExampleNamed();
			for(Object obj:listEmployeeBean)
			{
				Object[]  objArray = (Object[])obj;
				System.out.println(objArray[0]+","+objArray[1]);
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}
	public static void getAllEmployeeDetails2(EmployeeService serviceImpl) {

		try {

			List list = serviceImpl.stringFunctions();
			
			for(Object obj:list)
			{
				Object[] objArray = (Object[])obj;
				System.out.println(objArray[0]+","+objArray[1]+","+objArray[2]+","+objArray[3]+"\n");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}
	
	public static void getEmployeeDetailsWithinTest(EmployeeService employeeService, Date startDate, Date endDate) {
	    try {
	        List<EmployeeEntity> employeeEntities = employeeService.getEmployeeDetailsWithin(startDate, endDate);
	        System.out.println("Employees within the given date range:");
	        for (EmployeeEntity employeeEntity : employeeEntities) {
	            System.out.println(employeeEntity);
	        }
	    } catch (Exception e) {
	        System.out.println("Error: " + e.getMessage());
	    }
	}
	
	public static void updateEmployeeSalaryWithRoleTest(EmployeeService employeeService, String role, Double salary) {
	    try {
	        Integer updatedCount = employeeService.updateEmployeeSalaryWithRole(role, salary);
	        System.out.println("Number of employees updated with new salary for role " + role + ": " + updatedCount);
	    } catch (Exception e) {
	        System.out.println("Error: " + e.getMessage());
	    }
	}
	
	public static void deleteEmployeeByNameTest(EmployeeService employeeService, String name) {
	    try {
	        Integer deletedCount = employeeService.deleteEmployeeByName(name);
	        System.out.println("Number of employees deleted with name " + name + ": " + deletedCount);
	    } catch (Exception e) {
	        System.out.println("Error: " + e.getMessage());
	    }
	}



}