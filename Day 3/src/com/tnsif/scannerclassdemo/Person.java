package com.tnsif.scannerclassdemo;

public class Person {

	// data members
	private String name;
	private int age;
	private String gender;
	private double income;
	private double tax;

	// getters & setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double d) {
		this.tax = d;
	}

	// object class
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + ", income=" + income + ", tax=" + tax
				+ "]";
	}

}
