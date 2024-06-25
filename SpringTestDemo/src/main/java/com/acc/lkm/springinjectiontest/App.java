package com.acc.lkm.springinjectiontest;

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
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/acc/lkm/resource/beans.xml");
        Employee employee=(Employee)applicationContext.getBean("employee");
        System.out.println("Employee ID = " + employee.getEid());
 		System.out.println("Employee Name = " + employee.getName());
 		System.out.println("Employee Address = " + employee.getAddress());
 		System.out.println("Project ID = " + employee.getProject());
      //  System.out.println(employee.getProject().getPid());
       // System.out.println(employee.getProject().getName());
    }
}
