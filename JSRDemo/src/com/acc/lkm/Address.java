package com.acc.lkm;

import javax.inject.Named;
import javax.inject.Singleton;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component

public class Address {
public Address() {
	System.out.println("From Constructor of Address class");
		//super();
	}
@Value("DP Layout,Bangalore")
private String addressline1;
@Value("Malviya Nagar,Delhi")
private String addressline2;
public String getAddressline1() {
	return addressline1;
}
public void setAddressline1(String addressline1) {
	this.addressline1 = addressline1;
}
public String getAddressline2() {
	return addressline2;
}
public void setAddressline2(String addressline2) {
	this.addressline2 = addressline2;
}
}
