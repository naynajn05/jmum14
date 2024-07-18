package com.tnsif.userdefinedexceptiondemo;

import com.tnsif.trycatchdemo.AgeValidator;
import com.tnsif.trycatchdemo.InvalidAgeException;

public class VoterInfo {
	private String name;
	private int age;
	
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
		try {
			AgeValidator.isValidAge(age);
			this.age = age;
		} catch (InvalidAgeException e) {
			System.err.println("Please enter valid age"+e.getMessage());
		}
		
	}
	@Override
	public String toString() {
		return "VoterInfo [name=" + name + ", age=" + age + "]";
	}
	
	

}
