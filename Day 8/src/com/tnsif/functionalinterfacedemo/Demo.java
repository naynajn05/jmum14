package com.tnsif.functionalinterfacedemo;

public class Demo {

	public static void main(String[] args) {
		/*
		 * GreetClass gc=new GreetClass(); System.out.println(gc.greet());
		 */
		
		
		/*
		 * //lambda expression Greet g=()-> "Lambda Expression";
		 * System.out.println(g.greet());
		 */	
		
		Greet g=( a, b)-> a+b;
		System.out.println(g.add(12, 7));

	}

}
