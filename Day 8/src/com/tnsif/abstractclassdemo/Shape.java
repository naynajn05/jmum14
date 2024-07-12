package com.tnsif.abstractclassdemo;

public abstract class Shape {
	public double area;
	
	//solid/concrete
	public void showArea()
	{
		System.out.println(" The area of the shape is "+area);
	}
	
	//abstract method
	public abstract double calArea();

}
