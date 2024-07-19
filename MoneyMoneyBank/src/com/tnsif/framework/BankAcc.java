//abstract class for Bank account
package com.tnsif.framework;
//parent class
public abstract class BankAcc {
	//data members
	private int accNo;
	private String accNm;
	private float accBal;
	
	//getter and setter
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getAccNm() {
		return accNm;
	}
	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}
	public float getAccBal() {
		return accBal;
	}
	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}
	
	//constructor 
	public BankAcc(int accNo, String accNm, float accBal) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
	}
	
	//withdraw
	public void withdraw(float accBal)
	{
		System.out.println("withdrawal limit is "+ (accBal-1000.0));
	}
	
	//deposit
	public void deposit(float amount)
	{
		System.out.println("Account balance is "+(accBal+amount));
	}
	
	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + "]";
	}
	
	
	
	
	

}
