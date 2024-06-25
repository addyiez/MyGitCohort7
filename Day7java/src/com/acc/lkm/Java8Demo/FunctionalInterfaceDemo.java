package com.acc.lkm.Java8Demo;

public class FunctionalInterfaceDemo implements EmployeeFunctional{

	public static void main(String[] args) {
		FunctionalInterfaceDemo function=new FunctionalInterfaceDemo();
		function.get("17AprOB");
		function.company("Accenture");
		System.out.println(EmployeeFunctional.salary(100000.00));

	}

	@Override
	public void get(String OB) {
		// TODO Auto-generated method stub
		System.out.println(OB);
	}

}
