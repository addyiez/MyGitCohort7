package com.acc.lkm.dto;

import org.hibernate.validator.constraints.NotEmpty;

public class Login {
	@NotEmpty(message="Please Enter Username......It's Required")
	private String username;
	@NotEmpty(message="Please Enter Password......It's Required")
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
