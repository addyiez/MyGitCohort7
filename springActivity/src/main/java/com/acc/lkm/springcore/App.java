package com.acc.lkm.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        // Initialize the Spring application context using XML configuration
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        // Retrieve the Customer bean from the context
        Customer customer = applicationContext.getBean(Customer.class);

        // Retrieve the Bank bean from the context
        Bank bank = applicationContext.getBean(Bank.class);

        // Display customer and bank details
        displayCustomerDetails(customer);
        displayBankDetails(bank);
    }

    // Helper methods to display customer and bank details
    private static void displayCustomerDetails(Customer customer) {
        System.out.println("Customer ID: " + customer.getCustomerId());
        System.out.println("Customer Name: " + customer.getCustomerName());
        System.out.println("Customer Password: " + customer.getPassword());
    }

    private static void displayBankDetails(Bank bank) {
        System.out.println("Bank ID: " + bank.getBankId());
        System.out.println("Bank Name: " + bank.getBankName());
        System.out.println("Bank Location: " + bank.getLocation());
    }
}
