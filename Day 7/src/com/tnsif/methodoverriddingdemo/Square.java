package com.tnsif.methodoverriddingdemo;

public class Square extends Shape{
	private int side;

	
	public Square(int side) {
		super();
		this.side = side;
	}

	@Override
	public void draw()
	{
		System.out.println("Drawing a Square  with side "+side);
	}
	
	public void erase()
	{
		System.out.println("Earsing a Square with side "+side);
	}

}
