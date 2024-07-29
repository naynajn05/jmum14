package com.tnsif.threadsync;

public interface Bank {
	int min_bal=5000;
	int credit_limit=25000;
	
	void deposit(double amt) throws DailyLimitExceedexception;
	
	
	 void withdraw(double amt) throws InsufficientBalanceException;
	

}
