package com.acc.lkm.ExceptionDemo;

public class StackOverFlowErrorDemo {
static int x=0;

	public static void main(String[] args) {
		display(x);

	}

	private static int display(int i) {
		x=x+3;
		System.out.println(x);
		return x+display(x+2);
		//return 0;
	}

}
