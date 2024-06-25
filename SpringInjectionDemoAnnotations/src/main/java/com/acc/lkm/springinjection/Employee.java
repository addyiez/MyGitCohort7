package com.acc.lkm.springinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("employee2")
public class Employee {
	
	public Employee(Integer eid, String empName, String address) {
		super();
		Eid = eid;
		EmpName = empName;
		this.address = address;
	}

	public Employee() {
		super();
	}
    @Value("11")
	private Integer Eid;
    @Value("Morgan")
	private String EmpName;
    @Value("North America")
	private String address;
	@Autowired
	//@Qualifier("project2")
	@Value("#{myProj}")//SPEL
	Project project;// Creating ref var means HAS-A relationship,dependent bean

	public Integer getEid() {
		return Eid;
	}

	public void setEid(Integer eid) {
		Eid = eid;
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
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
	  System.out.println("\n Employee Details are:");
	  System.out.println("Employee ID:"+this.Eid);
	  System.out.println("Employee Name:"+this.EmpName);
	  System.out.println("Employee Address:"+this.address);
	  //System.out.println("Project ID:"+this.project.getPid());
	  //System.out.println("Project ID:"+this.project.getName());
  }
}
