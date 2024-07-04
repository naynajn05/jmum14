package com.tnsif.privateconstructordemo;

public class MyClassDemo {

	public static void main(String[] args) {
		//MyClass obj=new MyClass();
		
		MyClass obj1=MyClass.getObject();
		obj1.setId(12);
		System.out.println(obj1);
		
		
		MyClass m=MyClass.getObject();
		System.out.println(m);

	}

}
