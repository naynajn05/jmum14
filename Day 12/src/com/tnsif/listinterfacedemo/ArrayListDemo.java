package com.tnsif.listinterfacedemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		List numList=new ArrayList();
		System.out.println(numList.isEmpty());
		System.out.println(numList.size());
		numList.add(10);
		numList.add(12.7f);
		numList.add(true);
		numList.add(23556.99d);
		numList.add("Nayna");
		numList.add(null);
		numList.add("Nayna");
		numList.add(null);
		
	
		System.out.println(numList.isEmpty());
		System.out.println(numList.size());
		System.out.println(numList);
		
		System.out.println(numList.remove(true));
		
		System.out.println(numList);
		
		System.out.println(numList.add('A'));
		System.out.println(numList);
		System.out.println(numList.contains(false));
		
		System.out.println(numList.get(3));
		System.out.println(numList.indexOf("Nayna"));
		System.out.println(numList.lastIndexOf("Nayna"));
		
		//Collections.sort(numList); //RTE
		
		List<Integer> list1=new ArrayList<Integer>();
		list1.add(780);
		list1.add(98);
		list1.add(68);
		//list1.add("Nayna");
		list1.add(2,67);
		System.out.println(list1);
		
	   Collections.sort(list1);
		System.out.println(list1);
		Collections.reverse(list1);
		System.out.println(list1);
		

		// Using Generic we can create Homogeneous List
		List<String> names = new ArrayList<String>();
		names.add("Pallavi");
		names.add("Mahek");
		names.add("Sachin");
		names.add("Mayuresh");
		names.add("Shubham");
		// names.add(10); //CTE - Generic are type safety
		
		System.out.println("Name List is "+names);
		
		Collections.reverse(names);
		System.out.println("Reverse Name List is "+names);

		System.out.println("Is \'Shubham\' contains in name list? "+names.contains("Shubham"));

		System.out.println("Name List Before Sorting is "+names);
		Collections.sort(names);
		System.out.println("Sorting in Ascending order " + names);
		
		Collections.reverse(names);
		System.out.println("Sorting in Descending order " + names);

		// Traversing a list
		System.out.println("--------------- Traversing a list ---------------");
		Iterator<String> i = names.iterator();
		while (i.hasNext()) {
			String nm = i.next();
			System.out.println(nm);
			if (nm.equals("Ankit"))
				i.remove();
		}
	
		System.out.println("Name list is "+names);
		System.out.println("--------------- Traversing a list in backward manner ---------------");
		ListIterator<String> li=names.listIterator(names.size());
		while(li.hasPrevious())
		{
			String nm = li.previous();
			System.out.println(nm);		

	}

	}
}
