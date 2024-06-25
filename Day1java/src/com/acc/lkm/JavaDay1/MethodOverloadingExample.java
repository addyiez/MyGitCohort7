package com.acc.lkm.JavaDay1;

public class MethodOverloadingExample {
	
	public String name;
	public String role;
	public String cohart_number;
	
	void details(String n, String r) {
		name = n;
		role = r;
		display();
	}
	
	void details(String n, String r, String c_n) {
		name = n;
		role = r;
		cohart_number = c_n;
		display();
	}
	
	void display() {
		System.out.println(name);
		System.out.println(role);
		System.out.println(cohart_number);
	}
	

	public static void main(String[] args) {
			MethodOverloadingExample moe = new MethodOverloadingExample();
			moe.details("Subhajit", "Developer");
			moe.details("bikash", "Instructor", "01");
			moe.details("deo", "killer", "007");
	}

}
