//Program to demonstrate user defined generic class
package com.tnsif.generics;

//Generic Class
class GenericClass<T>
{
	T data;
	void set(T data)
	{
		this.data=data;
	}
	
	T get()
	{
		return data;
	}
}

