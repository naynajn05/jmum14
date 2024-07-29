package com.tnsif.threadsync;

public class AccountThread extends Thread {

	private BankAccount acc;
	private int amt;

	public AccountThread(BankAccount acc, int amt) {
		super();
		this.acc = acc;
		this.amt = amt;
		start();
	}

	public BankAccount getAcc() {
		return acc;
	}

	public void setAcc(BankAccount acc) {
		this.acc = acc;
	}

	public int getAmt() {
		return amt;
	}

	public void setAmt(int amt) {
		this.amt = amt;
	}
	
	
	public void run()
	{
		try {
			acc.withdraw(amt);
		} catch (InsufficientBalanceException e) {
			System.err.println(e);
		}
	}
	
	

}
