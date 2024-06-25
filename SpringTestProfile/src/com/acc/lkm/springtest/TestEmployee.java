package com.acc.lkm.springtest;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.acc.lkm.springcore.Employee;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="/com/acc/lkm/resources/beans.xml")
@ActiveProfiles(profiles="myProfile")
public class TestEmployee {

	@Autowired
	Employee employee;
	@Test
	public void testEmployee() {
		//ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/acc/lkm/resource/beans.xml");
		//Employee employee=(Employee)applicationContext.getBean("employee");
		Assert.assertTrue(employee!=null);
	}
	
	@Test
	public void testEmployeeID() {
		//ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/acc/lkm/resource/beans.xml");
		//Employee employee=(Employee)applicationContext.getBean("employee");
		Assert.assertTrue(employee.getEid()==100);
	}
	
	@Test
	public void testEmployeeAddress() {
		//ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/acc/lkm/resource/beans.xml");
		//Employee employee=(Employee)applicationContext.getBean("employee");
		Assert.assertTrue(employee.getAddress().equals("Denmark"));
	}
	
	@Test
	public void testEmployeeProject() {
		//ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/acc/lkm/resource/beans.xml");
		//Employee employee=(Employee)applicationContext.getBean("employee");
		Assert.assertTrue(employee.getProject().getPid()==21);
	}

}
