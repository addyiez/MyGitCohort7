package com.acc.lkm.ExceptionDemo;


import java.util.*;

public class ExceptionDemo {

	public static void main(String[] args)  {
 try {
	  int x=100;
	  int y=x/2;
	  System.out.println(y);
	  String str = "Accenture";
		Integer num = Integer.valueOf(str);
		System.out.println(num);
	/* String str2 = null;
		System.out.println(str2.length());
		int a[] = new int[10];
		a[20] = 400;
		
		
		/*Integer x = 100;
		Integer y = x / 0;
		System.out.println(y);
		Integer num2 = 100;
*/
	}
 
 
 catch(ArithmeticException ex) {
	 System.out.println("ARithmetic Exception");
 }
/* catch(NullPointerException ex) {
	 System.out.println("NullPointer Exception");
 }
 catch(NumberFormatException ex) {
	 System.out.println("NumberFormat Exception");
 }
 
 catch(Exception ex) {
		System.out.println("Exception is Handled");
	}*/
finally {
	 System.out.println("Always Executed");
 }
     
 
}}
