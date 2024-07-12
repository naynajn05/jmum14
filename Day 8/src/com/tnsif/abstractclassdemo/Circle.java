package com.tnsif.abstractclassdemo;

public class Circle extends Shape {
	
	private float radius;
	
	public Circle(float radius) {
		super();
		this.radius = radius;
	}



	public double calArea()
	{
		return this.area= 3.14*radius*radius;
	}

}
