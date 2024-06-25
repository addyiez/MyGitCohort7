package com.acc.lkm.Java8Demo;

public class AnonymousClassDemo {

	public static void main(String[] args) {
		Employee employee=new Employee() {
			
			@Override
			void getID(int id) {
				System.out.println(id);
				
			}
		};
		employee.getID(100);
		employee.stream("Java");

	}

}
