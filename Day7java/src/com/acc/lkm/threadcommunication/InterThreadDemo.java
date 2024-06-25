package com.acc.lkm.threadcommunication;

public class InterThreadDemo {

	public static void main(String[] args) {
		final Employee IT1=new Employee();
		new Thread() {
			public void run() {
				IT1.fetch(56000.00);
			}
		}.start();
      new Thread() {
    	  public void run() {
    		  IT1.receive(10000.00);
    	  }
      }.start();
	}

}
