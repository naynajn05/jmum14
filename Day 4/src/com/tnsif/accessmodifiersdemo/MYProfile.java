package com.tnsif.accessmodifiersdemo;

public class MYProfile {
	//date members
	public String name;
	private int age;
	long mobileNo;
	protected String email;
	
	//methods
	public void displayname()
	{
		System.out.println(name);
	}

	private void showAge()
	{
		System.out.println(age);
	}
	
	void getMobileNo()
	{
		System.out.println(mobileNo);
	}
	
	protected void sendEmail()
	{
		System.out.println(email);
	}
	
	public void display()
	{
		email="abc";
		sendEmail();
	}
	
}
