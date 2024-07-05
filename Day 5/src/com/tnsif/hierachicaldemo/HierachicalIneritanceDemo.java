package com.tnsif.hierachicaldemo;

public class HierachicalIneritanceDemo {

	public static void main(String[] args) {
		//Person p=new Person(); //tight coupling
		//p.study();
		
		Person p;
		
		p=new Person();//loose coupling
		if(p instanceof Person)
		System.out.println(p);
		
		p=new Student();
		if(p instanceof Student)
		System.out.println(p);
		//p.study();
		
		p=new Employee();
		if(p instanceof Employee)
		System.out.println(p);
		
	}

}
