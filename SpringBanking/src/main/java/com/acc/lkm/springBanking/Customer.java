package com.acc.lkm.springBanking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("customer")
public class Customer {
	@Value("100")
	private Integer customer_Id;
	@Value("Roy")
	private String customer_Name;
	@Value("crazypeople123")
	private String password;
	
	@Autowired
	Bank bank;
	
	
	public Customer() {
		super();
		
	}
	public Customer(Integer customer_Id, String customer_Name, String password) {
		super();
		this.customer_Id = customer_Id;
		this.customer_Name = customer_Name;
		this.password = password;
		System.out.println("Customer Id : "+customer_Name+" Customer ID : "+customer_Id+" Password : "+password);
	}
	public Integer getCustomer_Id() {
		return customer_Id;
	}
	public void setCustomer_Id(Integer customer_Id) {
		this.customer_Id = customer_Id;
	}
	public String getCustomer_Name() {
		return customer_Name;
	}
	public void setCustomer_Name(String customer_Name) {
		this.customer_Name = customer_Name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void display() {
		System.out.println("\nBank Details are:");
		System.out.println("Customer ID:" + this.customer_Id);
		System.out.println("Customer Name:" + this.customer_Name);
		System.out.println("Password :"+this.password);
		System.out.println("Bank ID :" + this.bank.getBank_Id());
		System.out.println("Bank Name :" + this.bank.getBank_Name());
		System.out.println("Bank Location :" + this.bank.getLocation());
	}
	
	
	
	
}
