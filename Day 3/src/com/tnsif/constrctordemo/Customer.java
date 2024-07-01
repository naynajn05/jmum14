//Customer Entity class
package com.tnsif.constrctordemo;

public class Customer {
	private String name;
	private int id;
	private String city;
	
	
	//Default Constructor
	public Customer() {
		this.name = "Jyoti";
		this.id = 11;
		this.city = "ulhasNagar";
	}
	
	//Parameterized constructor
	//use of this keyword
	public Customer(String name, int id, String city) {
		
		this();
		this.name = name;
		this.id = id;
		this.city = city;
	}



	//Getters & SettersS
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	//Object Class method
	@Override
	public String toString() {
		return "Customer [name=" + name + ", id=" + id + ", city=" + city + "]";
	}
	
	
	

}
