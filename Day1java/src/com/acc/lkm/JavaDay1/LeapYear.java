package com.acc.lkm.JavaDay1;
import java.util.*;

public class LeapYear {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);

		System.out.println("Enter a year");

		int year = sc.nextInt();

		if((year  % 4 == 0 && year % 100 != 0) || (year%400 ==0 )){
		   System.out.println("Is a leap year");
		}else{
		   System.out.println("Is not a leap year");
		} 

		sc.close();
	}

}
