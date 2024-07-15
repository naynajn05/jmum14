package com.tnsif.interfacedemo;

public class BankImpl implements Bank{

	@Override
	public void deposit(Account account, double amount) {
		if(amount>deposit_limit)
		{
			System.err.println("Sorry..you can not deposit more than 25000");
		}else
		{
			account.setBalance(account.getBalance()+amount);
			System.out.println("your account is credited with "+amount);
		}
		
	}

	@Override
	public void withdraw(Account account, double amount) {
		if(account.getBalance()-amount>=deposit_limit)
		{
		account.setBalance(account.getBalance()-amount);
		System.out.println("The amount "+ amount 
				+" is swithdrawn from your account");
		}else
		{
			System.err.println("Insufficient balance");
		}
		
	}

}
