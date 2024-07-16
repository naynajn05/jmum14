package com.tnsif.trycatchdemo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NestedTryCatch {

	public static int divide(int x,int y)
	{
		int z=0;
		z=x/y;
		System.out.println(z);
		return z;
	}
	
	public static void main(String[] args) {
		int x,y,z;
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the first no");
			x = sc.nextInt();
			System.out.println("Enter the second no");
			y = sc.nextInt();
			try {
				z=divide(x,y);
			} catch (ArithmeticException e) {
				System.out.println("Error due to division by zero "+e.getMessage());
			}
		} catch (InputMismatchException e) {
			System.out.println("Please enter Integer value  "+e.getMessage());
		}
	}

}
