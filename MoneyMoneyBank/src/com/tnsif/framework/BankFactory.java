package com.tnsif.framework;

public interface BankFactory {
	
	 SavingAcc getNewSavingAccount(int accNo,String accNm,float accBal,boolean isSalaried);
	
	CurrentAcc getNewCurrentAccount(int accNo,String accNm,float accBal,float creditLimit);

}
