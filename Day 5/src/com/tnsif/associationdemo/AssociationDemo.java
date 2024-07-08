package com.tnsif.associationdemo;

public class AssociationDemo {

	public static void main(String[] args) {
		Address address=new Address("JM Road","Mumbai","MH",421203);
		
		Student s1=new Student(1,"Suhani",address);
		System.out.println(s1);

	}

}
