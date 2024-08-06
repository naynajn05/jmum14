package com.tnsif.lamdaexpdemo;

public class Executor {

	public static void main(String[] args) {
		Cube c=(a)-> a*a*a;
		System.out.println(c.calculateCube(2));
		
		Odd o=(num)->num % 2!=0 ? true:false;
		System.out.println(o.isOdd(5));

	}

}
