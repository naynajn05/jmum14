//to demonstrate static variable
package com.tnsif.staticdemo;

public class Employee {
	private int empId;
	private String name;
	
	//Static variable-shared by all the instances of the class
	private static String CompanyName="TNS";

	public Employee(int empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ",CompanyName=" + CompanyName +"]";
	}
	
	

}
