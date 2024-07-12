package com.tnsif.abstractclassdemo;

public class AbstractionDemo {

	public static void main(String[] args) {
		
		Shape s;
		
		s=new Circle(2);
		s.calArea();
		s.showArea();
		
		s=new Square(5);
		s.calArea();
		s.showArea();
		
		
		s=new Rectangle(3,4);
		s.calArea();
		s.showArea();
		
		
	}

}
