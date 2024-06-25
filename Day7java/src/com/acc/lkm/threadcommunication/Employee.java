package com.acc.lkm.threadcommunication;

public class Employee {
double salary=10000.00;
String name;

synchronized void fetch(double salary) {
	System.out.println("Fetching Salary....");

if(this.salary<salary) {
	System.out.println("Specified Salary is less for Employee");
			try {
				wait();
			}catch(Exception e) {
				System.out.println(e);
			}
}
this.salary-=salary;
System.out.println("Salary withdrawn");
}
synchronized void receive(double salary) {
	System.out.println("Going to receive salary");
	this.salary+=salary;
	System.out.println("Salary done..");
	notify();
}
}