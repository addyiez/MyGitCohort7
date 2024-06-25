package com.acc.lkm.springinjectiontest;

public class Employee {
	public Employee(Integer eid, String name, String address) {
		super();
		this.eid = eid;
		this.name = name;
		this.address = address;
	}

	public Employee() {
		super();
	}

	private Integer eid;
	private String name;
	private String address;
	Project project;// creating ref var means HAS-A relationship,dependent bean

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}
	public void display() {
		System.out.println("\nEmployee Details are:");
		System.out.println("Employee ID:" + this.eid);
		System.out.println("Employee Salary:" + this.name);
		System.out.println("Employee address is :"+this.address);
		System.out.println("Project ID :" + this.project.getPid());
		System.out.println("Project Name:" + this.project.getName());
	}

}
