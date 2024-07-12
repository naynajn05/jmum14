package com.tnsif.abstractclassdemo;

public class Rectangle extends Shape {

	private float height;
	private float width;
	
	
	
	
	public Rectangle(float height, float width) {
		super();
		this.height = height;
		this.width = width;
	}




	@Override
	public double calArea() {
		return this.area=height*width;
	}

}
