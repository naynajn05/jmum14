package com.tnsif.test;

public class GenericMethod {
	
	public <E> void displayArrayElements( E[] elements)
	{
		for( E e:elements)
		{
			System.out.println("Element is "+e);
		}
	}
	
public<T> void print (T message)
{
	System.out.println(message);
}

}
