package com.acc.lkm.springcore;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Customer {
    private int customerId;
    private String customerName;
    private String password;

    // Constructor Injection
    public Customer(@Value("${customer.id}") int customerId) {
        this.customerId = customerId;
    }

    // Setter Injection
    @Value("${customer.name}")
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    // Setter Injection
    @Value("${customer.password}")
    public void setPassword(String password) {
        this.password = password;
    }

    // Getter methods
    public int getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getPassword() {
        return password;
    }

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
}
