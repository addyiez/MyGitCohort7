package com.acc.lkm.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Bank {
    private int bankId;
    private String bankName;
    private String location;

    // Constructor Injection
    @Autowired
    public Bank(@Value("${bank.id}") int bankId) {
        this.bankId = bankId;
    }

    public Bank() {
		// TODO Auto-generated constructor stub
	}

	// Setter Injection
    @Value("${bank.name}")
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    // Setter Injection
    @Value("${bank.location}")
    public void setLocation(String location) {
        this.location = location;
    }

    // Getter methods
    public int getBankId() {
        return bankId;
    }

    public String getBankName() {
        return bankName;
    }

    public String getLocation() {
        return location;
    }
}
