
package com.tnsif.singlelevel;

///child class
public class Student extends Citizen {
	
	
	private int id;
	private String collegeName;
	private String branch;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	public Student() {
		super();
	}
	public Student(String name, String aadharNo, long phNo, String gender, int id, String collegeName, String branch) {
		super(name, aadharNo, phNo, gender);
		this.id = id;
		this.collegeName = collegeName;
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", collegeName=" + collegeName + ", branch=" + branch + ", getName()=" + getName()
				+ ", getAadharNo()=" + getAadharNo() + ", getPhNo()=" + getPhNo() + ", getGender()=" + getGender()
				+ "]";
	}
	
	
	
	

}
