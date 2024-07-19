package com.tnsif.framework;

public class SavingAcc extends BankAcc{
	
	private boolean isSalaried;
	private static final float minBal=1000.0f;
	
	//constructor 
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal);
		this.isSalaried = isSalaried;
	}

	public boolean isSalaried() {
		return isSalaried;
	}

	public void setSalaried(boolean isSalaried) {
		this.isSalaried = isSalaried;
	}

	public static float getMinbal() {
		return minBal;
	}
	//withdraw-override
	public void withdraw(float amount)
	{
		System.out.println("Account balance is "+(this.getAccBal()-amount));
	}

	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm()
				+ ", getAccBal()=" + getAccBal() + "]";
	}

	
	

	



}
