//to demonstrate encapsulation concept
package com.tnsif.encapsulationdemo;

//student entity class
public class Student {
	//declare data member
	private String name;
	private int	id;
	private int age;
	
	//getters & setters
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//object class method
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", age=" + age + "]";
	}
	
	

}
