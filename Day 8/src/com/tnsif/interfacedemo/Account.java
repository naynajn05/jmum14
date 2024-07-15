package com.tnsif.interfacedemo;

public class Account {
	private int acc_no;
	private String name;
	private double balance;
	private Bank bank;

	// constructor
	public Account(int acc_no, String name, double balance, Bank bank) {
		super();
		this.acc_no = acc_no;
		this.name = name;
		this.balance = balance;
		this.bank = bank;
	}

	// getters and setters
	public int getAcc_no() {
		return acc_no;
	}

	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}
	
	//deposit method
	void deposit(double amount)
	{
		bank.deposit(this,amount);
	}
	
	//withdraw method
	void withdraw(double amount)
	{
		bank.withdraw(this, amount);
	}

	@Override
	public String toString() {
		return "Account [acc_no=" + acc_no + ", name=" + name + ", balance=" + balance + ", bank=" + bank + "]";
	}

}
