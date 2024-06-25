package com.acc.lkm.entity;

import javax.persistence.*;

@Entity
@Table(name="Patient")
public class PatientEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "User_Id")
	private String user_id;
	@Column(name = "Password")
	private String password;
	@Column(name = "Phone_Number")
	private Long phone;
	@Column(name = "Email_Id")
	private String email;

	public PatientEntity() {
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
