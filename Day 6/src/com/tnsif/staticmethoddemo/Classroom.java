//to demonstrate static method and static block
package com.tnsif.staticmethoddemo;

public class Classroom {
	
	private int section; //0
	
	private static int srNo;
	
	static {
		System.out.println("in static block");
		srNo=10;
		//section=1;
	}

	public Classroom() {
		System.out.println("inside the constructor");
		section++;
		srNo++;
	}

	@Override
	public String toString() {
		return "Classroom [section=" + section + ",srNo= " + srNo +"]";
	}
	
	static void display()
	{
		System.out.println("sr No is "+srNo);
		//System.out.println("section is "+section);
	}
	
	public void show()
	{
		System.out.println("sr No is "+srNo);
		System.out.println("section is "+section);
	}
	
	
	
	

}
