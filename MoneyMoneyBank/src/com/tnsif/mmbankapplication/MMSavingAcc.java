package com.tnsif.mmbankapplication;

import com.tnsif.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc{

	private static final float minBal=500;

	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal, isSalaried);
	}
	
	//withdraw-override
		public void withdraw(float amount)
		{
			System.out.println("Account balance is "+(this.getAccBal()-amount));
		}

		@Override
		public String toString() {
			return "MMSavingAcc [toString()=" + super.toString() + "]";
		}
	

}
