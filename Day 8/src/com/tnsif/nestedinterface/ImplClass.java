package com.tnsif.nestedinterface;

public class ImplClass implements OuterInterface.InnerInterface{

	@Override
	public void display() {
		System.out.println("Display method");
		
	}

}
