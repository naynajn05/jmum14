package com.tnsif.threadsync;

public class BankAccount implements Bank {

	private int accNo;
	private String accName;
	private double balance;

	public BankAccount() {
		super();
	}

	public BankAccount(int accNo, String accName, double balance) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.balance = balance;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public synchronized void deposit(double amt) throws DailyLimitExceedexception {
		if(credit_limit>amt)
		{
			
			balance+=amt;
			System.out.println("your account is credited with Rs "+amt);
		}else
		{
			throw new DailyLimitExceedexception("Exceeds daily limit");
		}

	}

	@Override
	public synchronized void withdraw(double amt) throws InsufficientBalanceException {
		if(balance-amt >= min_bal)
		{
			balance-=amt;
			System.out.println("Amount is withdrawn "+amt);
		}else
		{
			throw new InsufficientBalanceException();
		}

	}

	@Override
	public String toString() {
		return "BankAccount [accNo=" + accNo + ", accName=" + accName + ", balance=" + balance + "]";
	}

}
