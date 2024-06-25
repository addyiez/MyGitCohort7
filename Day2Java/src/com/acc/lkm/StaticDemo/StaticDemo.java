package com.acc.lkm.StaticDemo;

import java.util.Scanner;

public class StaticDemo {
	// you will create a utility class for an e-commerce application. This utility
	// class will handle some common tasks such as generating order IDs, managing a
	// list of all orders, and providing some static configuration settings.
	// Understand and use static variables.
	// Implement and call static methods.
	// Use static blocks for initialization.
	// Define and use a static nested class.

	public static int order_id = 0;

	public static void updateOrderId() {
		order_id++;
	}

	public static void main(String[] args) {
		StaticDemo sd = new StaticDemo();
		int n = 1;
		while(n!=0){
		StaticDemo.updateOrderId();
		System.out.println("order Id: "+StaticDemo.order_id);
		System.out.println("Book Another Product?\n");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		}
//		StaticDemo.updateOrderId();
//		System.out.println(StaticDemo.order_id);
	}
}
