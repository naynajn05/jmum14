package com.tnsif.lamdaexpdemo;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class UsingFunctionalInterfaces {
	class Test
	{
		public static void display(String name)
		{
			System.out.println("Welcome " +name);
	
		}
		
	}
	

	public static void main(String[] args) {
		//Consumer 
		
		Consumer<String> c=(name)-> System.out.println("Hello "+name);
		c.accept("Nayna");
		
		c=System.out::println;//method reference
		c.accept("BE CSE");
		
		c=Test::display;
		c.accept("Arya");
		
		//supplier
		
		Supplier<String> s=()-> "Nayna";
		System.out.println(s.get());
		
		//Predicate
		//Positive test
		Predicate<Integer> p=(num)->num >0 ;
		System.out.println(p.test(-23));
		
		//Function
		//max value
		BiFunction<Integer,Integer,Integer> bi=(x,y)->x>y ?x:y;
		System.out.println(bi.apply(36, 4));
		
		Function<Float,Double> f=(x)->  (double)(x*x);
		System.out.println(f.apply(4.5f));
		
 
	
	}
	

}
