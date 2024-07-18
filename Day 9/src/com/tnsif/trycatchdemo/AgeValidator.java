package com.tnsif.trycatchdemo;

public class AgeValidator {
	
	public static void isValidAge(int age) throws InvalidAgeException
	{
		if(age>=18)
		{
			System.out.println("Eligible for voting");
		}else
		{
			throw new InvalidAgeException();
		}
	}

}
