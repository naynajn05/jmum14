package com.tnsif.multithreadingdemo;

public class ChildThread  extends Thread{
	private int n;
	private String msg;
	
	//constructor
	public ChildThread(int n, String msg) {
		
		this.n = n;
		this.msg = msg;
	}
	
	public void run()
	{
		for(int i=1;i<=n;i++)
		{
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println("message is "+msg+" " +i
				+Thread.currentThread().getName());
		}
	}
	

}
