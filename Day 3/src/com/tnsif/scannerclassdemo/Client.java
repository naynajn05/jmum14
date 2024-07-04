package com.tnsif.scannerclassdemo;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter your name");	
	String name=sc.next();
	System.out.println("Enter your age");
	int age=sc.nextInt();
	System.out.println("Enter your income");
	double income=sc.nextDouble();
	System.out.println("Enter your gender");
	String gender=sc.next();
	
	Person p=new Person();
	p.setAge(age);
	p.setGender(gender);
	p.setIncome(income);
	p.setName(name);
	
	TaxCalculation tax=new TaxCalculation();
	tax.calculateTax(p);

	}

}
