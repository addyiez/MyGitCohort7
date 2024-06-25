package com.acc.lkm.threadcommunication;

public class ThreadSync3 extends Thread{
	ThreadSyncDemo threadsync;

	public ThreadSync3(ThreadSyncDemo threadsync) {
		//super();
		this.threadsync = threadsync;
	}
	public void run() {
		threadsync.result(20);
	}

	
}
