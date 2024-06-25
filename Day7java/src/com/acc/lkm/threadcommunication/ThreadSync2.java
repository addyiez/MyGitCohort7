package com.acc.lkm.threadcommunication;

public class ThreadSync2 extends Thread{
	
	ThreadSyncDemo threadsync;

	public ThreadSync2(ThreadSyncDemo threadsync) {
		//super();
		this.threadsync = threadsync;
	}
	public void run() {
		threadsync.result(10);
	}
}
