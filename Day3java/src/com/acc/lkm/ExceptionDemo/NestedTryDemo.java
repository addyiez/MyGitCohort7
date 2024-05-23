package com.acc.lkm.ExceptionDemo;
import java.io.IOException;
import java.sql.SQLException;
import java.util.*;
public class NestedTryDemo {
	static String empname="Rohan";
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	try {
		
		try {
			System.out.println("Enter the num:");
			Integer x=scan.nextInt();
			Integer y=x/0;
			System.out.println(y);
		}catch(Exception ex) {
			System.out.println(ex);
		}
		
try {
		if(empname==null) {
			throw new IOException("Employee is invalid");
		}
		else {
			throw new SQLException("Employee valid");
		}
		}catch(Exception ex) {
			System.out.println(ex);
		}
	}catch(Exception ex) {
		System.out.println("Handled successfully");
	}
	finally {
		System.out.println("Closed Connection");
	}

	}

}
