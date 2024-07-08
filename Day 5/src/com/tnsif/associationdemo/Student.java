package com.tnsif.associationdemo;


//contained class
public class Student {
	//data members
	private int rollNo;
	private String name;
	
	//dependency
	private Address address;

	
//constructors
	public Student(int rollNo, String name, Address address) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
	}

	
	
	public Student() {
	super();
}

	
	//getters and setters
		public int getRollNo() {
			return rollNo;
		}



	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", address=" + address + "]";
	}


}
