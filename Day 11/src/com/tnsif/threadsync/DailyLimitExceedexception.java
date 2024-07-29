package com.tnsif.threadsync;

public class DailyLimitExceedexception extends Exception {

	
	DailyLimitExceedexception()
	{
		super("Your amount should be less than 25000Rs");
	}
	
	DailyLimitExceedexception(String msg)
	{
		super(msg);
	}
}
