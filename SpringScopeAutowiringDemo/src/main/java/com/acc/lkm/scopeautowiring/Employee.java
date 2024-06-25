package com.acc.lkm.scopeautowiring;

public class Employee {
	public Employee(Integer eid, String name, Double salary) {
		super();
		Eid = eid;
		this.name = name;
		this.salary = salary;
		System.out.println("I have highest Parameter");
	}

	public Employee(Company company) {
		super();
		this.company = company;
		System.out.println("I have a Single Parameter");
	}

	private Integer Eid;
	private String name;
	private Double salary;
	Company company;// ref var of Company,dependent bean

	public Employee() {
		super();
		System.out.println("I have No Parameter");
	}

	public Integer getEid() {
		return Eid;
	}

	public void setEid(Integer eid) {
		Eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

}
