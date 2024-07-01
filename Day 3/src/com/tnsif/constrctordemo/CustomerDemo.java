package com.tnsif.constrctordemo;

public class CustomerDemo {

	public static void main(String[] args) {
		Customer c1=new Customer();
		
		System.out.println(c1);
		
		Customer c2=new Customer("Chirag",23,"Mumbai");
		
		System.out.println(c2);
		

	}

}
