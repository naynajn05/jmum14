package com.tnsif.trycatchdemo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatch {

	public static void main(String[] args) {
		System.out.println("In main method");
		int x, y, z;

		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the first no");
			x = sc.nextInt();
			System.out.println("Enter the second no");
			y = sc.nextInt();

			z = x / y;
			System.out.println("result of division is " + z);
		} catch (InputMismatchException ie) {
			System.err.println("Error due to incorrect input " + ie.getMessage());

		}catch (ArithmeticException e) {
			System.err.println("Error due to division by zero " + e.getMessage());
		}  catch (Exception e) {
			System.out.println("Exception occured.." + e.getMessage());
		}

	}

}
