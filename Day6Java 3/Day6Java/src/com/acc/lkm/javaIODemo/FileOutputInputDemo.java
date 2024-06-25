package com.acc.lkm.javaIODemo;
import java.io.*;
public class FileOutputInputDemo {

	public static void main(String[] args) {
		try {
			FileOutputStream fileOutputStream=new FileOutputStream("LearningIO.txt");
			String str="I am learning Java IO today";
			byte b1[]=str.getBytes();//converting String data to bytes
			fileOutputStream.write(b1);
			fileOutputStream.close();
		}catch(IOException ex) {
			System.out.println("File Created");
		}
		try {
		FileInputStream fileInputStream=new FileInputStream("LearningIO.txt");
		int x=0;
		while((x=fileInputStream.read())!=-1) {
			System.out.print((char)x);
		}

	}catch(Exception ex) {
		System.out.println(ex);
	}

	}}
