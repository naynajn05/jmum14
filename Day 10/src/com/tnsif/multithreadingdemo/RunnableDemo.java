package com.tnsif.multithreadingdemo;

public class RunnableDemo {

	public static void main(String[] args) {
		//UsingRunnable u1=new UsingRunnable(20,10,"Hello");
		//way 2
	/*	Runnable r1=new  Runnable()
				{

					@Override
					public void run() {
						System.out.println("Alternate way");
						
					}
			
				};
				
				new Thread(r1).run();

	}*/
	
	//way 3
	Runnable r2= ()->System.out.println("Lambda Expression");
	
	new Thread(r2).run();

}
}
