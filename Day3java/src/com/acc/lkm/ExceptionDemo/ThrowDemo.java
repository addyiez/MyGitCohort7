package com.acc.lkm.ExceptionDemo;

import java.io.IOException;

public class ThrowDemo {

	public static void main(String[] args) {
		try {
			//Calling a method that will throw Exception
			readFile();
		}catch(IOException ex) {
			System.out.println(ex.getMessage());
		}

	}

	private static void readFile()throws IOException {
		throw new IOException("File Not Found");
		
	}

}
