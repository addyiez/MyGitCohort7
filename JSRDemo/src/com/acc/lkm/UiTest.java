package com.acc.lkm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.acc.resources.MyConfig;

public class UiTest {

	public static void main(String[] args) {
	System.setProperty("spring.profiles.active","myProfile");	
	//ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/acc/lkm/resources/my_springbean.xml");
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfig.class);
	Employee employee=(Employee)applicationContext.getBean("emp");
	//System.out.println(employee);
	System.out.println("Employee Details");
	System.out.println(employee.getEmployeeId());
	System.out.println(employee.getEmployeeName());
	System.out.println(employee.getSalary());
	System.out.println(employee.getAddress().getAddressline1());
	System.out.println(employee.getAddress().getAddressline2());
	/*Employee employee2=(Employee)applicationContext.getBean("emp");
	System.out.println(employee2.getEmployeeId());
	System.out.println(employee2.getEmployeeName());
	System.out.println(employee2.getSalary());*/

	}

}
