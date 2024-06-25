package com.acc.lkm.scopeautowiring;

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
        System.out.println( "Hello SpringBeanScope!" );
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
        Employee employee=(Employee)applicationContext.getBean("employee");
        //===========Bean Scope===========
        /*employee.setEid(40);
        employee.setName("Peter");
        employee.setSalary(110000.00);
        System.out.println("Employee Details:");
        System.out.println(employee.getEid());
        System.out.println(employee.getName());
        System.out.println(employee.getSalary());
        Employee employee2=(Employee)applicationContext.getBean("employee");
        System.out.println(employee2.getEid());
        System.out.println(employee2.getName());
        System.out.println(employee2.getSalary());*/
        System.out.println("Employee Details:");
        System.out.println(employee.getEid());
        System.out.println(employee.getName());
        System.out.println(employee.getSalary());
       // System.out.println("Company Details:");
       // System.out.println(employee.getCompany().getComp_name());
        //System.out.println(employee.getCompany().getLocation());
         
    }
}
