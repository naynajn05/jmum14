package com.tnsif.threadsync;

public class AccountDemo {

	public static void main(String[] args) {
		BankAccount ba=new BankAccount(21,"Gaurav",50000);
		System.out.println(ba);
		AccountThread arr[]=new AccountThread[5];
		
		for(int i=0;i<5;i++) {
			arr[i]=new AccountThread(ba,1000*(i+1));
			System.out.println(ba);
			try {
				arr[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		System.out.println(ba);
	}

}
