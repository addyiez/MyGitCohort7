package com.acc.lkm.businessbean;

import java.util.Date;

public class EmployeeBean {
	@Override
	public String toString() {
		return "EmployeeBean [id=" + id + ", name=" + name + ", role=" + role + ", insertTime=" + insertTime
				+ ", salary=" + salary + "]";
	}
	private Integer id;
	private String name;
	private String role;
	private Date insertTime;
	private Double salary;
public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Date getInsertTime() {
		return insertTime;
	}
	public void setInsertTime(Date insertTime) {
		this.insertTime = insertTime;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}

}
