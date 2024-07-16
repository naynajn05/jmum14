package com.tnsif.trycatchdemo;

public class ArrayDemo {
	
	public static void main(String[] args) {
		/*try {
			ArrayOperations obj= new ArrayOperations(new int[] {2,4,5,6});
			obj.displayArray();
			System.out.println("The element is: "+obj.getElement(2));
			System.out.println("The element is: "+obj.getElement(10));
		}catch(ArrayIndexOutOfBoundsException ae) {
			System.err.println("Error!..."+ ae.getMessage());
		}*/
		
		try {
			ArrayOperations obj1= new ArrayOperations();
			obj1.getElement(0);
		} catch (NullPointerException e) {
			System.out.println("Null Array "+e.getMessage());
		}
	}

} 
