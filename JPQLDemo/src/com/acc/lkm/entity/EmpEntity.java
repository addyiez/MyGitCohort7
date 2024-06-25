package com.acc.lkm.entity;

import javax.persistence.*;

@Entity
@Table(name="EmpJPQL")
//@NamedQuery(name="fetch",query="SELECT x from EmpEntity x")
//@NamedQuery(name="Update",query="UPDATE EmpEntity SET dept='Hybris',emp_location='Indore' where eid=1")
@NamedQuery(name="delete",query= "delete from EmpEntity where eid = '1'")
public class EmpEntity {
	public EmpEntity() {
		super();
	}
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer eid;
    @Column(name="EmpName")
	private String emp_name;
    @Column(name="Location")
	private String emp_location;
	private String dept;

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getEmp_location() {
		return emp_location;
	}

	public void setEmp_location(String emp_location) {
		this.emp_location = emp_location;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

}
