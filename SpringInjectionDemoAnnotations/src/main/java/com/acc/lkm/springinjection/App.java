package com.acc.lkm.springinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Spring!" );
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
        Employee employee=(Employee)applicationContext.getBean("employee2");
        System.out.println("Employee ID="+employee.getEid());
        System.out.println("Employee Name="+employee.getEmpName());
        System.out.println("Employee Address="+employee.getAddress());
        System.out.println("Project Details ="+employee.getProject());
    }
}
