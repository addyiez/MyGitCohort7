package com.acc.lkm.businessbean;

import javax.persistence.*;

public class PatientBean {

	private Long id;
	private String user_id;
	private String password;
	private Long phone;
	private String email;

	public PatientBean() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserId() {
		return user_id;
	}

	public void setUserId(String userId) {
		this.user_id = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", userId=" + getUserId() + ", password=" + password + ", phone=" + phone
				+ ", email=" + email + "]";
	}
}
