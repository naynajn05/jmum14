package com.tnsif.abstractclassdemo;

public class Square extends Shape {
	
	private float side;
	
	
	
	public Square(float side) {
		super();
		this.side = side;
	}



	public double calArea()
	{
		return this.area=side*side;
	}

}
