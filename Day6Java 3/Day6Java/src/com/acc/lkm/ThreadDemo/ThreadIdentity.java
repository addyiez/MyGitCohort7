package com.acc.lkm.ThreadDemo;

public class ThreadIdentity extends Thread{
 public void run() {
	 System.out.println("Thread is running....");
	 System.out.println(Thread.currentThread().getPriority());
	 System.out.println(Thread.currentThread().getId());
 }
	public static void main(String[] args) {
		ThreadIdentity thread1=new ThreadIdentity();
		ThreadIdentity thread2=new ThreadIdentity();
		ThreadIdentity thread3=new ThreadIdentity();
		System.out.println("Name of Thread:"+thread1.getName());
		System.out.println("Name of Thread:"+thread2.getName());
		System.out.println("Name of Thread:"+thread3.getName());
		System.out.println("Id of Thread:"+thread1.getId());
		System.out.println("Id of Thread:"+thread2.getId());
		System.out.println("Id of Thread:"+thread3.getId());
		thread1.setPriority(Thread.MAX_PRIORITY);
		thread2.setPriority(Thread.MIN_PRIORITY);
		thread3.setPriority(Thread.NORM_PRIORITY);
		thread1.start();
		thread2.start();
		thread3.start();

	}

}
