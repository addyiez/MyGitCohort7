package com.acc.lkm.ThreadDemo;

import java.util.concurrent.ThreadLocalRandom;

public class ThreadDemo2 extends Thread{
public void run() {
	for(int p=1;p<=4;p++) {
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			System.out.println(e);
		}
		System.out.println(p);
	}
}
	public static void main(String[] args) {
		ThreadDemo2 thread1=new ThreadDemo2();
		ThreadDemo2 thread2=new ThreadDemo2();
		ThreadDemo2 thread3=new ThreadDemo2();
		//thread1.start();
		//thread2.start();
         thread1.start();
         try {
        	 thread1.join(1000);
        	 
         }catch(Exception ex) {
        	 System.out.println(ex);
         }
         thread2.run();
         thread3.run();
	}

}
