package com.tnsif.staticmethoddemo;

public class ClassroomDemo {

	public static void main(String[] args) {
		
		
		Classroom.display();
		
		Classroom c1=new Classroom();
		c1.display();
		
		c1.show();
		System.out.println("--------------");
		Classroom c2=new Classroom();
		c2.show();
	
	}

}
