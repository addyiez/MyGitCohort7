package com.acc.lkm.dto;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class User {
	@NotEmpty(message = "Username Required!!")
	private String Username;
	
	public String getUsername() {
		return Username;
	}
	public void setUsername(String Username) {
		this.Username = Username;
	}
	@NotEmpty(message = "Password Required!!")
	@Size(min = 8,message = "Password should be of minimum 8 char length")
	private String password;
	
	@NotEmpty(message = "Gender Required!!")
	private String gender;
	//format - 1997/09/11
	@Past(message = "Please enter old Date!!")
	private Date dateOfBirth;

	@Email(message = "Please enter valid Email ID")
	private String email;
	
	private List<String> skills;
	private String city;
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}
