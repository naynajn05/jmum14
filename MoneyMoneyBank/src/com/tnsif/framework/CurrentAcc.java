package com.tnsif.framework;

public class CurrentAcc extends BankAcc {
  private final float creditLimit;
  
//constructor
public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
	super(accNo, accNm, accBal);
	this.creditLimit = creditLimit;
}

public float getCreditLimit() {
	return creditLimit;
}
  
//deposit-override
public void deposit(float amount)
{
	System.out.println("Account balance is "+(this.getAccBal()+amount));
}

@Override
public String toString() {
	return "CurrentAcc [creditLimit=" + creditLimit + ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm()
			+ ", getAccBal()=" + getAccBal() + "]";
}


  
}
