//Program to define User defined exception class
package com.tnsif.userdefinedexceptiondemo;

public class InvalidMarksException extends Exception{

	public InvalidMarksException() {
		super();
	}

	public InvalidMarksException(String message) {
		super(message);
	}

	
}