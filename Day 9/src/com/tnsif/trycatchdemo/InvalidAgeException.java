package com.tnsif.trycatchdemo;

public class InvalidAgeException extends Exception {
	
	InvalidAgeException()
	{
		super("Invalid age");
	}
	
	InvalidAgeException(String message){
		super(message);	
	}

}
