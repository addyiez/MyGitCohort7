package com.acc.lkm;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

//@Component
@Profile("myProfile")
@Named("emp")
//@Singleton
public class Employee {
	public Employee() {
		//System.out.println("Hello My Profile is Active");
		System.out.println("Hello We are in JSR-330");
		
	}
	public Employee(Address address) {
		super();
		this.address = address;
		System.out.println("From Constructor of Employee");
	}
	@Value("1001")
	private Integer employeeId;
	@Value("40000.00")
	private Double salary;
	@Value("Rahul")
	private String employeeName;
	//@Value("#{myAddress}")//SPEL (SPring Exp Lang)
	@Resource
	//@Autowired
	//@Inject
	private Address address;//Represents HAS-A Relationship
public Integer getEmployeeId() {
		return employeeId;
	}
	public Address getAddress() {
	return address;
}
//@Inject
public void setAddress(Address address) {
	this.address = address;
}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

}
