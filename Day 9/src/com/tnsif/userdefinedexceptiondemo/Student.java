package com.tnsif.userdefinedexceptiondemo;

public class Student {

	private String name;
	private int id;
	private float per;

	public Student() {
		super();
	}

	public Student(String name, int id, float per) {
		super();
		this.name = name;
		this.id = id;
		this.per = per;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getPer() {
		return per;
	}

	public void setPer(float per) {
		this.per = per;
	}

	public void show() {
		try {
		PercentageValidator.isValidPercentage(per);
		System.out.println("Name " + name + " " + "Roll no " + id + " " + "Per " + per);
		}catch(ArithmeticException ae)
		{
			System.err.println("Invalid Percentage "+ae.getMessage());
		}
	}

}
