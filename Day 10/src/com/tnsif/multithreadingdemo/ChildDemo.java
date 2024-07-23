package com.tnsif.multithreadingdemo;

public class ChildDemo {

	public static void main(String[] args) {
		ChildThread t1 = new ChildThread(5, "Hello");
		ChildThread t2 = new ChildThread(7, "Hi");

		t1.start();
		// t1.start(); //IllegalThreadStateException
		// t1.run(); //single threaded program
		t2.start();

		System.out.println("End of main");

	}

}
