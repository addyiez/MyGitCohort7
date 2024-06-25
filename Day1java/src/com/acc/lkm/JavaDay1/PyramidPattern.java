package com.acc.lkm.JavaDay1;

public class PyramidPattern {

	public static void main(String[] args) {
		for(int i=0; i<5;i++){
			for(int j=0; j<5+i; j++){
				if(j<4-i) {
			        System.out.print(" ");
				}else {
			        System.out.print("*");
				}
			}
	        System.out.println();
		}

	}

}
