package com.acc.lkm.threadcommunication;

public class ThreadTest {

	public static void main(String[] args) {
		
		ThreadSyncDemo threadSyncDemo= new ThreadSyncDemo();
		ThreadSync2 thread1 = new ThreadSync2(threadSyncDemo);
		ThreadSync3 thread2 = new ThreadSync3(threadSyncDemo);
		thread1.start();
		thread2.start();
	}

}
