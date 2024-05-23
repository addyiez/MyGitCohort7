package com.acc.lkm.LinkedList;

import java.util.LinkedList;

import java.util.Scanner;

class Customer {

	int cust_id;

	String name;

	String product;

	double price;

	public Customer(int cust_id, String name, String product, double price) {

		this.cust_id = cust_id;

		this.name = name;

		this.product = product;

		this.price = price;

	}

	@Override

	public String toString() {

		return "Customer ID: " + cust_id + ", Name: " + name + ", Product: " + product + ", Price: " + price;

	}

}

public class CustomerManagement {

	LinkedList<Customer> customers;

	Scanner scanner;

	public CustomerManagement() {

		customers = new LinkedList<>();

		scanner = new Scanner(System.in);

	}

	public void addCustomer() {

		System.out.println("Enter Customer ID:");

		int cust_id = scanner.nextInt();

		scanner.nextLine(); // consume newline

		System.out.println("Enter Name:");

		String name = scanner.nextLine();

		System.out.println("Enter Product:");

		String product = scanner.nextLine();

		System.out.println("Enter Price:");

		double price = scanner.nextDouble();

		customers.add(new Customer(cust_id, name, product, price));

		System.out.println("Customer added successfully!");

	}

	public void displayCustomers() {

		if (customers.isEmpty()) {

			System.out.println("No customers available.");

		} else {

			System.out.println("List of Customers:");

			for (Customer customer : customers) {

				System.out.println(customer);

			}

		}

	}

	public static void main(String[] args) {

		CustomerManagement manager = new CustomerManagement();

		Scanner scanner = new Scanner(System.in);

		boolean exit = false;

		while (!exit) {

			System.out.println("1. Add Customer\n2. Display Customers\n3. Exit");

			int choice = scanner.nextInt();

			switch (choice) {

			case 1:

				manager.addCustomer();

				break;

			case 2:

				manager.displayCustomers();

				break;

			case 3:

				exit = true;

				break;

			default:

				System.out.println("Invalid choice. Please enter again.");

			}

		}

		scanner.close();

	}

}
