package com.acc.lkm.javaIODemo;
import java.io.*;
public class FileWriteRead {

	public static void main(String[] args) throws Exception{
		try {
			FileWriter fw=new FileWriter("Greetings.txt");
			fw.write("Hello! nice to meet you");
			fw.close();
			System.out.println("data written to file");
			/*FileReader fr=new FileReader("Greetings.txt");
			int ch=0;
			while((ch=fr.read())!=-1) {
				System.out.println((char)ch);
			}
			}
			*/
		}
		catch(Exception e) {
			System.out.println(e);
		}	
	}
	 

	}


