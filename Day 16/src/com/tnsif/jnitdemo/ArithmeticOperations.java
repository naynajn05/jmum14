package com.tnsif.jnitdemo;

public class ArithmeticOperations {
	
	public static int getSquare(int no) {
	return	no*no;
		
	}
	
	public static int getMaxValue(int arr[]) {
		int maxValue=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>maxValue)
				maxValue=arr[i];

		}
		return maxValue;
		
	}

	public static boolean checkPalindrome(int no)
	{
		int rev=0,dno=no;
		while(no!=0)
		{
			rev=rev*10+no%10;
			no=no/10;
		}
		if(rev==dno)
			return true;
		else
			return false;
	}
	
	public static boolean isPositive(int no)
	{
		
			return no>0;
	}
	
	public static int getFactorial(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
}
