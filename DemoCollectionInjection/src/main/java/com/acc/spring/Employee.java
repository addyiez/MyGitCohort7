package com.acc.spring;

import java.util.List;
import java.util.Set;

public class Employee {
	
	private int eid;
	private String name;
	private double salary;
	private Dog eDog;
	private List<String> languages;
	private Set<Project> projects;
	
	//parameterized constructor
	public Employee(int eid,String name,double salary)
	{
		this.eid=eid;
		this.name=name;
		this.salary=salary;
	}
	
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Dog geteDog() {
		return eDog;
	}

	public void seteDog(Dog eDog) {
		this.eDog = eDog;
	}

	public List<String> getLanguages() {
		return languages;
	}

	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}

	public Set<Project> getProjects() {
		return projects;
	}

	public void setProjects(Set<Project> projects) {
		this.projects = projects;
	}
	
	

}
