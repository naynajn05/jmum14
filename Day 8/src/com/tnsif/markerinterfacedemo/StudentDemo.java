package com.tnsif.markerinterfacedemo;

public class StudentDemo {

	public static void main(String[] args) {
		Student s1=new Student(12,"Suhani");
		Student s2=new Student(11,"Sejal");
		//Account a=new Account();
		
		if(s1 instanceof Registrable)
		{
			System.out.println("Student is registered for the course");
		}else
		{
			System.out.println("Student is not registered for the course");
		}

	}

}
