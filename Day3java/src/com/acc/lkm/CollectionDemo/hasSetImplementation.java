package com.acc.lkm.CollectionDemo;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class hasSetImplementation {
	public static void main(String[] args) {
		Set<String> h = new HashSet<>();
 
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		System.out.println("Enter your Choice:");
		System.out.println("Enter 1 to add");
		System.out.println("Enter 2 to remove");
		System.out.println("Enter 3 to display unsorted");
		System.out.println("Enter 4 to display sorted");
		System.out.println("Enter 0 to exit");
		do {
			choice = sc.nextInt();
 
			switch (choice) {
			case 0: System.exit(0);
			case 1:
				System.out.println("Enter Cust_id");
				String cust_id = sc.next();
				h.add(cust_id);
				System.out.println("Enter Name");
				String name = sc.next();
				h.add(name);
				System.out.println("Enter Product");
				String product = sc.next();
				h.add(product);
				System.out.println("Enter Price");
				String price = sc.next();
				h.add(price);
				break;
			case 2:
				System.out.println("Enter the value to remove");
				String remove = sc.next();
				h.remove(remove);
				break;
			case 3:
				System.out.println(h);
				break;
			case 4:
				LinkedHashSet<String> lh = new LinkedHashSet<>(h);
		        TreeSet<String> treeSet = new TreeSet<>(lh);
				System.out.println(treeSet);
				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}
 
		} while (choice != 0);
	}

}
