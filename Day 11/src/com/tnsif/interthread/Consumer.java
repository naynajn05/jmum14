package com.tnsif.interthread;

public class Consumer extends Thread {
	Q obj; 

	public Consumer(Q obj) {
		this.obj = obj;
		start();
	}

	public void run() {
			while (true) {
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				System.out.println(e);
			}
			obj.get();
		}
	}
}
