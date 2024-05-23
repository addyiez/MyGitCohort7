package com.acc.lkm.JavaDay1;

import java.util.Scanner;

public class ArrayQuestion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int [] elements = new int[5];
		
		System.out.println("Enter elements of the array");

		for(int i=0; i<4; i++){
		      elements[i] = sc.nextInt();
		}
		
		for(int i=0; i<4; i++){
			System.out.println(elements[i]);
		}
		
		System.out.println("After inserting the last element");
		
		elements[(elements.length)-1] = 20;
		
		for(int i=0; i<5; i++){
			System.out.println(elements[i]);
		}

	}

}
