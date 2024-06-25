package com.acc.lkm.comparatordemo;
import java.util.Comparator;

public class EmployeeSalary implements Comparator<EmployeeSalary> {
	int EID;
	String name;
	double Salary;
	
	public EmployeeSalary(int eID2, String name2, double salary2) {
		this.EID= eID2;
		this.name= name2;
		this.Salary= salary2;
	}
	
	public int compare(EmployeeSalary emp1, EmployeeSalary emp2) {
		EmployeeSalary employeeSalary = (EmployeeSalary)emp1;
		EmployeeSalary employeeSalary1 = (EmployeeSalary)emp2;
		if(employeeSalary1.Salary>employeeSalary.Salary) {
			//comapre the salary of two objs
			return 1;
		}
		else if(employeeSalary1.Salary<employeeSalary.Salary) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
}
