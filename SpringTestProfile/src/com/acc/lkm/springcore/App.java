package com.acc.lkm.springcore;

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
        //System.setProperty("spring.profiles.active", "myProfile");
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/acc/lkm/resources/beans.xml");
        Employee employee=(Employee)applicationContext.getBean("empObj");
        System.out.println("Employee ID = " + employee.getEid());
 		System.out.println("Employee Name = " + employee.getName());
 		System.out.println("Employee Address = " + employee.getAddress());
 		System.out.println("Project ID = " + employee.getProject());
      //  System.out.println(employee.getProject().getPid());
       // System.out.println(employee.getProject().getName());
    }
}
