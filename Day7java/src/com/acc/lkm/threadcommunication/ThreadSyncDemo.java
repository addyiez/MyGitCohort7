package com.acc.lkm.threadcommunication;

public class ThreadSyncDemo {

	void result(int res) {
		for(int x=1; x<4;x++) {
			System.out.println(x*(res+1));
			try {
				Thread.sleep(1000);
			}
			catch(Exception ex) {
				System.out.println(ex);
			}
		}
	}

}
