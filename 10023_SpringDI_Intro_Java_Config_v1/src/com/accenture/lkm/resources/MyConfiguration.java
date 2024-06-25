package com.accenture.lkm.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.accenture.lkm.Address;
import com.accenture.lkm.Employee;

@Configuration
public class MyConfiguration {
	@Bean//(name="employeeSp")// works like <bean> to declare bean id/name of Employee and it is replacement of <bean>
	//Bean will be managed by name 'createEmployee'
	public Employee createEmployee(){
		Employee  employee = new Employee();
		 //Equivalent to setter injection using tag: <property>
		employee.setEmployeeId(1001);    
		employee.setEmployeeName("Jack");
		employee.setSalary(89.9);
		Address address= createAddress();
		employee.setAddress(address);
		return  employee;
	}
	@Bean(name="address")
	public Address createAddress(){
		Address address = new Address();
		address.setAddressLine1("AddressLine1");
		address.setAddressLine2("AddressLine2");
		return address;
	}
}
// if Bean name is not given then the bean is created by the name of the method
// here if employeeSp is commented then bean will be created by the name of createEmployee