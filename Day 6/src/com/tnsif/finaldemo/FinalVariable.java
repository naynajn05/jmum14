package com.tnsif.finaldemo;

public class FinalVariable {
	
	
	//final int x;//final variable should be initialized at the time of declaration
	
	final int x=20;
	
	final static int y;
	
	final static int z=56;
	
	
	static
	{
		System.out.println("In static block");
		y=67;
	}
	
	//instance method
	void change()
	{
		x=34; //can not reassigned value
		y=23;
		z=56;
	}
	
	static void show()
	{
		//System.out.println("X is "+x);
		System.out.println("Y is "+y);
		System.out.println("Z is "+z);
	}

}
