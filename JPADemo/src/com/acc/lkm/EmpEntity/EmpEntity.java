package com.acc.lkm.EmpEntity;
import javax.persistence.*;
@Entity
@Table(name="Employee")
public class EmpEntity {
	public EmpEntity() {
		super();
	}
    @Id
    @GeneratedValue
	private Integer empId;
	private String empName;
	@Column(name="Role")
	private String role;
	private Double Salary;

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Double getSalary() {
		return Salary;
	}

	public void setSalary(Double salary) {
		Salary = salary;
	}

}
