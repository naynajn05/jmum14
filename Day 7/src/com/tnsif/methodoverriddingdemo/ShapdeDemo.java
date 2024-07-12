package com.tnsif.methodoverriddingdemo;

public class ShapdeDemo {

	public static void main(String[] args) {
		//creating array of shape objects
		Shape[] shape=new Shape[3];
		shape[0] =new Circle(3);
		shape[1]=new Square(4);
		shape[2]=new Triangle(2,6);
		
		for(Shape s:shape)
		{
			s.draw();
			s.erase();
		}

	}

}
