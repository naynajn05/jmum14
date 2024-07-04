// to demonstrate private constructor
package com.tnsif.privateconstructordemo;

public class MyClass {
	private int id;
	
	
	//declaration and initialization of object
	private static MyClass obj=new MyClass();

	//private constructor
	private MyClass() {
		System.out.println("Private Constructor");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	//factory method
	public static MyClass getObject()
	{
		return obj;
	}

	@Override
	public String toString() {
		return "MyClass [id=" + id + "]";
	}
	
	
	
	
	
	

}
