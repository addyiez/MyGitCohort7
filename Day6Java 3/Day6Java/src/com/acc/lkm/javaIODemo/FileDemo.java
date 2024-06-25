package com.acc.lkm.javaIODemo;
import java.io.*;


public class FileDemo {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		
			File file=new File("file1.txt");
			if(file.createNewFile()) {
				System.out.println("New File Created");
				System.out.println();
			}
			else {
				System.out.println("File already exist");
			}
		}
	}


