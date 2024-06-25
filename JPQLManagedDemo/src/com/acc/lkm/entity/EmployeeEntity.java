package com.acc.lkm.entity;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="Employee2")
public class EmployeeEntity {
	public AssetEntity getAssetEntity() {
		return assetEntity;
	}

	public void setAssetEntity(AssetEntity assetEntity) {
		this.assetEntity = assetEntity;
	}

	public EmployeeEntity() {
		super();
	}
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer employeeId;
	private String employeeName;
	private String role;
	@Temporal(TemporalType.DATE)
	private Date insertTime;
	private Double Salary;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="assetId_fk",unique=true)
	private AssetEntity assetEntity;
	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
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
		return Salary;
	}

	public void setSalary(Double salary) {
		Salary = salary;
	}

}
