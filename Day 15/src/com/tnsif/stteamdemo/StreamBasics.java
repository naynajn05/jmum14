package com.tnsif.stteamdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamBasics {

	public static void main(String[] args) {
		//way 1
		Stream<Integer> stream=Stream.of(1,6,8,4,6,9,9);
		
		Long count=stream.count();
		System.out.println(count);
		
		//System.out.println(stream.filter(num->num>0));//Throws illegal state exception

		
		//way 2 from arrays
		Integer[] values=new Integer[] {12,56,4,67,78,89,45,67,2};
		Stream<Integer> str=Arrays.stream(values);
		//map to calculate square of stream values
		str.map(num->num*num).forEach(System.out::println);
		//str1.forEach(System.out::println);
		
		System.out.println("----------------------");
		Integer[] numbers=new Integer[] {1,3,5,7,6,9,2,5,6};
		Arrays.stream(numbers).
		map(num->num*2).
		filter(num->num>2).distinct().limit(3).skip(1).
		forEach(System.out::println);
		
		
		//way 3 Collections
		List<String> names=Arrays.asList("Aditya","Om","Shardul","Manish","Mayuresh");		
		//names.stream().map(name->name.toUpperCase()).forEach(System.out::println);
		List<String> newNames=names.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
		System.out.println(newNames);
	}

}
