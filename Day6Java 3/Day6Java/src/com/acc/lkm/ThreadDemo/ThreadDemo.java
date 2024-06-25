package com.acc.lkm.ThreadDemo;

//public class ThreadDemo extends Thread{
public class ThreadDemo implements Runnable{
	public void run() {
		System.out.println("Thread is running.....");
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		ThreadDemo threadDemo=new ThreadDemo();
		//ThreadDemo threadDemo2=new ThreadDemo();
		Thread thread=new Thread(threadDemo);
	    //thread.start();
	    //thread.start();
	    thread.run();
	    thread.run();
	    //threadDemo2.start();

	}

}
