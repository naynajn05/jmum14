package com.tnsif.methodoverriddingdemo;

public class Triangle extends Shape {
	
	private int base;
	private int height;

	
	
	
	public Triangle(int base, int height) {
		super();
		this.base = base;
		this.height = height;
	}

	@Override
	public void draw()
	{
		System.out.println("Drawing a Traingle  with base and height "
				+base +" "+height);
	}
	
	public void erase()
	{
		System.out.println("Earsing a Traingle  with base and height "
				+base +" "+height);
	}
	}



