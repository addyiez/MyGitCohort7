package com.acc.lkm.springBanking;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("bank")
public class Bank {
	@Value("100111")
	private Integer bank_id;
	@Value("AccBank")
	private String bank_name;
	@Value("Kolkata")
	private String location;
	
	@Override
	public String toString() {
		return "Bank [bank_id=" + bank_id + ", bank_name=" + bank_name + ", location=" + location + "]";
	}

	public Bank() {
		super();
	}

	public Bank(Integer bank_id, String bank_name, String location) {
		super();
		this.bank_id = bank_id;
		this.bank_name = bank_name;
		this.location = location;
	}
	
	public Integer getBank_Id() {
		return bank_id;
	}
	public void setBank_id(Integer bank_id) {
		this.bank_id = bank_id;
	}
	public String getBank_Name() {
		return this.bank_name;
	}

	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
//	
//	public Bank getBank() {
//		return bank;
//	}
//	public void setBank(Bank bank) {
//		this.bank = bank;
//	}
//	
	
	
}
