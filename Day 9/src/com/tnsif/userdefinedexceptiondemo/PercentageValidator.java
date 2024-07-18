package com.tnsif.userdefinedexceptiondemo;

public class PercentageValidator {
	
	public static void isValidPercentage(float per) throws ArithmeticException
	{
		
		if(per>=60 && per<=100)
		{
			System.out.println("Valid Percentage");
		}else
		{
			throw new ArithmeticException("Requires more than 60 % ");
		}
	}

}
