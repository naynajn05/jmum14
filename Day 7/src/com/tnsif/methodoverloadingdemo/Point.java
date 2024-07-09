package com.tnsif.methodoverloadingdemo;

public class Point {
	int x;
	int y;
	
	
	public Point() {
		
		this.x = 0;
		this.y = 0;
	}
	
	public Point(int x)
	{
		this.x=x;
		this.y=x;
	}
	
	public Point(int x, int y)
	{
		this.x=x;
		this.y=y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	
	
}
