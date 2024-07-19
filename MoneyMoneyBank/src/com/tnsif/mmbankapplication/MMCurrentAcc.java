package com.tnsif.mmbankapplication;

import com.tnsif.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc{

	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
		
	}
	
	//deposit-override
	public void deposit(float amount)
	{
		System.out.println("Account balance is "+(this.getAccBal()+amount));
	}

	@Override
	public String toString() {
		return "MMCurrentAcc [toString()=" + super.toString() + "]";
	}
	
	

}
