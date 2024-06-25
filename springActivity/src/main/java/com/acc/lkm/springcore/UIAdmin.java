package com.acc.lkm.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UIAdmin {
    private Bank bank;
    private Customer customer;

    @Autowired
    public UIAdmin(Bank bank, Customer customer) {
        this.bank = bank;
        this.customer = customer;
    }

    
    public void displayBankDetails() {
        System.out.println("Bank Name: " + bank.getBankName());
        System.out.println("Location: " + bank.getLocation());
       
    }

   
    public void displayCustomerDetails() {
        System.out.println("Customer Name: " + customer.getCustomerName());
        System.out.println("Customer ID: " + customer.getCustomerId());
      
    }

}
