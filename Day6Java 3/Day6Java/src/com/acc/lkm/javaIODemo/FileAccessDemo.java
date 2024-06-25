package com.acc.lkm.javaIODemo;

import java.io.*;
import java.util.Scanner;

public class FileAccessDemo {

	public static void main(String[] args) {
		try {
		File myObj = new File("file2.txt");
		
	      if (myObj.createNewFile()) {
	        System.out.println("File created: " + myObj.getName());
	        
	      } else {
	        System.out.println("File already exists.");
	        
	        // Getting path of the file   
            System.out.println("The absolute path of the file is: " + myObj.getAbsolutePath());   
         // Checking whether the file is writable or not  
            System.out.println("Is file writeable?: " + myObj.canWrite());    
   
            // Checking whether the file is readable or not  
            System.out.println("Is file readable " + myObj.canRead());    
   
            // Getting the length of the file in bytes  
            System.out.println("The size of the file in bytes is: " + myObj.length());  
	      }
	    } catch (IOException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
			 
	}
			  
}
		 
	