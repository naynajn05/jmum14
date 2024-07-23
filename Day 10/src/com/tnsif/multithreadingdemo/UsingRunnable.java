package com.tnsif.multithreadingdemo;

public class UsingRunnable implements Runnable {
	Thread thread;
	int high, low;
	String msg;

	public UsingRunnable(int high, int low, String msg) {

		this.high = high;
		this.low = low;
		this.msg = msg;
		
		Thread t1=new Thread(this,"child thread");
		t1.start();
	}

	@Override
	public void run() {
		for(int i=low;i<=high;i++)
		{
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(msg+" "+i);
		}

	}

}
