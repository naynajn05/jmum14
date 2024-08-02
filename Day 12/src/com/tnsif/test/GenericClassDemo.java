package com.tnsif.test;

public class GenericClassDemo {

	public static void main(String[] args) {
		GeneriClass<Integer> intObj=new GeneriClass<Integer>();
		intObj.set(12);
		System.out.println(intObj.get());
		
		GeneriClass<Float> floatObj=new GeneriClass<Float>();
		floatObj.set(12.5f);
		System.out.println(floatObj.get());
		
		GeneriClass<Object> obj=new GeneriClass<Object>();
		obj.set("Nayna");
		System.out.println(obj.get());
	}

}
