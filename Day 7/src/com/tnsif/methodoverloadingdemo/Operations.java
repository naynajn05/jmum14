package com.tnsif.methodoverloadingdemo;

public class Operations {
	
	//method 1
	public static boolean isPalindrome(int number)
	{
		int rev=0;
		int dummyNumber=number;
		while(number!=0)
		{
			rev=rev*10+number%10;
			number/=10;
		}
		return dummyNumber==rev;
	}
	
	//method 2
	public static boolean isPalindrome(String name)
	{
		String rev;
		rev=new  StringBuffer(name).reverse().toString();
		return name.equals(rev);
		
	}

}
