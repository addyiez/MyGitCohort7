package com.acc.lkm.comparatordemo;
import java.util.*;

public class EmployeeUI {
	
	public static void main(String[] args) {
		List<EmployeeSalary>empList=new ArrayList<EmployeeSalary>();
		empList.add(new EmployeeSalary(17,"Peter",67000.00));
		empList.add(new EmployeeSalary(46,"John",91000.00));
		empList.add(new EmployeeSalary(91,"Morgan",71000.00));
		System.out.println("salary compare");
		Collections.sort(empList, new EmployeeSalary(0,null,0.0));
		for(EmployeeSalary employeeSalary:empList) {
			System.out.println("EID is : "+employeeSalary.EID+"\n");
		}
 
	}
 
}
