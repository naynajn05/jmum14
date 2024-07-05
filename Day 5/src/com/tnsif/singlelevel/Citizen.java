//to demonstrate single level inheritance
package com.tnsif.singlelevel;

//parent entity class
public class Citizen {
	
	private String name;
	private String aadharNo;
	private long phNo;
	private String gender;
	
	//setter & getter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}
	public long getPhNo() {
		return phNo;
	}
	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	//parameterized constructor
	public Citizen(String name, String aadharNo, long phNo, String gender) {
	
		this.name = name;
		this.aadharNo = aadharNo;
		this.phNo = phNo;
		this.gender = gender;
	//	super();
	}
	//default constructor
	public Citizen() {
		System.out.println("Default constructor");
		//name="Sanika";
	}
	@Override
	public String toString() {
		return "Citizen [name=" + name + ", aadharNo=" + aadharNo + ", phNo=" + phNo + ", gender=" + gender + "]";
	}
	
	
	
	
	
	
	

}
