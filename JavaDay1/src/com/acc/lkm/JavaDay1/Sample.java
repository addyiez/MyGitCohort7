package com.acc.lkm.JavaDay1;

public class Sample {
	int a=100;//instance var
	static String org="Accenture";
	
	void set(int x) {//local var
		System.out.println(x);
	}
	void display() {
		System.out.println(a);
	}
	public static void main(String[] args) {
		Sample sample = new Sample();
		sample.set(300);;
		System.out.println(sample.a);
		System.out.println(org);
		
	}

}
