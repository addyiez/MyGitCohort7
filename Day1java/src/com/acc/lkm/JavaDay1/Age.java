package com.acc.lkm.JavaDay1;
 
import java.util.Scanner;
 
public class Age {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter age : ");
		int age=sc.nextInt();
		if(age<13){
		    System.out.println("Child");
		}
		else if(age>=13 && age<20){
		    System.out.println("Teenager");
		}
		else if(age>=20 && age<65){
		    System.out.println("Adult");
		}
		else{
		    System.out.println("Senior");
		}
	}
}

