package com.tnsif.methodoverloadingdemo;

public class OperationsDemo {

	public static void main(String[] args) {
		boolean status=Operations.isPalindrome(121);
		System.out.println(status);
		
		status=Operations.isPalindrome(1212);
		System.out.println(status);
		
		status=Operations.isPalindrome("racecar");
		System.out.println(status);
		
		status=Operations.isPalindrome("car");
		System.out.println(status);
		
		Point p1=new Point();
		System.out.println(p1);
		
		p1=new Point(2,3);
		System.out.println(p1);
		
		p1=new Point(6);
		System.out.println(p1);

	}

}
