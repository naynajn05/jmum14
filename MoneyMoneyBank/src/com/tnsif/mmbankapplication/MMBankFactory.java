package com.tnsif.mmbankapplication;

import com.tnsif.framework.BankFactory;
import com.tnsif.framework.CurrentAcc;
import com.tnsif.framework.SavingAcc;

public class MMBankFactory implements BankFactory {

	@Override
	public SavingAcc getNewSavingAccount(int accNo, String accNm, float accBal, boolean isSalaried) {
		SavingAcc s1=new SavingAcc(accNo,accNm,accBal,isSalaried);
		return s1;
	}

	@Override
	public CurrentAcc getNewCurrentAccount(int accNo, String accNm, float accBal, float creditLimit) {
		CurrentAcc c1=new CurrentAcc(accNo,accNm,accBal,creditLimit);
		return c1;
	}

}
