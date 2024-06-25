package com.acc.lkm.springtest;

import com.acc.lkm.springcore.AppConfig;
import com.acc.lkm.springcore.Bank;
import com.acc.lkm.springcore.Customer;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.assertEquals;

public class AccBankApplicationTests {

    private ApplicationContext context;
    private Customer customer;
    private Bank bank;

    @Before
    public void setUp() {
        // Initialize the Spring application context using AppConfig
        context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Retrieve Customer and Bank beans from the context
        customer = context.getBean(Customer.class);
        bank = context.getBean(Bank.class);
    }

    @Test
    public void testCustomerPassword() {
        // Set customer password and verify
        customer.setPassword("testPassword");
        assertEquals("testPassword", customer.getPassword());
    }

    @Test
    public void testBankName() {
        // Set bank name and verify
        bank.setBankName("AccBank");
        assertEquals("AccBank", bank.getBankName());
    }

    @Test
    public void testCustomerId() {
        // Set customer ID and verify
        customer.setCustomerId(12345);
        assertEquals(12345, customer.getCustomerId());
    }
}
