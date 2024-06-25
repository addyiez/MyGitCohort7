package com.acc.lkm.springinjectiontest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="/com/acc/lkm/resource/beans.xml")
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
		Assert.assertTrue(employee.getEid()==50);
	}
	
	@Test
	public void testEmployeeAddress() {
		//ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/acc/lkm/resource/beans.xml");
		//Employee employee=(Employee)applicationContext.getBean("employee");
		Assert.assertTrue(employee.getAddress().equals("Chennai"));
	}

}
