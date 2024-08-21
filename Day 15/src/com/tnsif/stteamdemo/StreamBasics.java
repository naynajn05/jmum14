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
		Integer[] values=new Integer[] {1,2,3,4,5};
		Stream<Integer> str=Arrays.stream(values);
		//map to calculate square of stream values
		str.map(num->num*2).forEach(System.out::println);
		//str1.forEach(System.out::println);
		
		System.out.println("----------------------");
		Integer[] numbers=new Integer[] {1,3,5,7,6,9,2,5,6};
		Arrays.stream(numbers).
		map(num->num*2).
		filter(num->num>2).distinct().limit(3).skip(1).
		forEach(System.out::println);
		
		
		//way 3 Collections
		List<String> names=Arrays.asList("Aditya","Om","Shardul","Manish","Mayuresh");
		//names.forEach(System.out::println);
		//names.stream().map(name->name.toUpperCase()).forEach(System.out::println);
		List<String> newNames=names.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
		System.out.println(newNames);
		
		
	}

}
