package com.tnsif.interfacedemo;

public interface Bank {
	//static and final data members
	 double Min_Balance=1000;
	 double deposit_limit=25000;
	
	
	//abstract methods
	 void deposit(Account account,double amount);
	 void withdraw(Account account,double amount);

}
