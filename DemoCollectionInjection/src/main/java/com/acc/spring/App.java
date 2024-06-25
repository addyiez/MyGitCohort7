package com.acc.spring;

import java.util.Set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
        
        Employee emp=(Employee)ctx.getBean("employee");
        
        System.out.println(emp.getEid());
        System.out.println(emp.getName());
        System.out.println(emp.getSalary());
        System.out.println("Employee Friend");
        System.out.println(emp.geteDog().getName());
        System.out.println(emp.geteDog().getBreed());
        System.out.println("Employee knows these languages");
        System.out.println(emp.getLanguages());
        System.out.println("Employee works with following Projects ");
        
        Set<Project> empPrjs=emp.getProjects();
        for(Project p:empPrjs)
        {
        	System.out.println(p.getName());
        }
        
        
    }
}
