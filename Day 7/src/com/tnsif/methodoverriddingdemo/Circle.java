package com.tnsif.methodoverriddingdemo;

public class Circle extends Shape{
	
	private int radius;
	
	

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	@Override
	public void draw()
	{
		System.out.println("Drawing a circle with radius "+radius);
	}
	
	public void erase()
	{
		System.out.println("Earsing a circle with radius "+radius);
	}
}
