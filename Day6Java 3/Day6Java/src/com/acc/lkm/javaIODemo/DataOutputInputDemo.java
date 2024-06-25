package com.acc.lkm.javaIODemo;
import java.io.*;
public class DataOutputInputDemo {

	public static void main(String[] args) throws Exception{
		DataOutputStream dataOutputStream=new DataOutputStream(new FileOutputStream("fileIO.txt"));
		dataOutputStream.writeUTF("This is dataoutput stream");
		System.out.println("Created file");
		
		//Reading data from file in decoded format
		DataInputStream dataInputStream=new DataInputStream(new FileInputStream("fileIO.txt"));
		while(dataInputStream.available()>0) {
			String str=dataInputStream.readUTF();
			System.out.println(str+" ");
		}

	}

}
