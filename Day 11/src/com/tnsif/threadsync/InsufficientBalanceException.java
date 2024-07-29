package com.tnsif.threadsync;

public class InsufficientBalanceException extends Exception {
	InsufficientBalanceException()
	{
		super("Low balance");
	}
	InsufficientBalanceException(String msg)
	{
		super(msg);
	}

}
