package com.acc.lkm.springBanking;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.acc.lkm.springBanking.Bank;

public class App 
{
    public static void main( String[] args )
    {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/acc/lkm/resources/beans.xml");
        Customer customer=(Customer)applicationContext.getBean("customer");
        System.out.println("\nBank Details are:");
        customer.display();
    }
}
