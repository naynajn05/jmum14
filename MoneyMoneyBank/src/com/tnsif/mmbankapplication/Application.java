package com.tnsif.mmbankapplication;


import com.tnsif.framework.BankFactory;

import com.tnsif.framework.SavingAcc;
import com.tnsif.framework.CurrentAcc;

public class Application {

	public static void main(String[] args) {
		BankFactory bank=new MMBankFactory();
		
		SavingAcc s1=new MMSavingAcc(10,"Sachin",20000,true);
		s1.withdraw(5000);
		System.out.println(s1);
		
		CurrentAcc c1=new MMCurrentAcc(11,"Mayuresh",20000,10000);
		c1.deposit(2000);
		System.out.println(c1);

	}

}
