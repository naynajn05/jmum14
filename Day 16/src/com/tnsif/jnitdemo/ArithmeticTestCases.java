package com.tnsif.jnitdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ArithmeticTestCases {

	@Disabled
	@Test
	public void testSquare()
	{
		int sq=ArithmeticOperations.getSquare(2);
		System.out.println(sq);
		assertEquals(4,sq);
	}
	
	@Test
	public void testMax()
	{
		int arr[]= {-2,-5,-1,-8,-23,90,45};
		int max=ArithmeticOperations.getMaxValue(arr);
		assertEquals(90,max);
	}
	@Test
	public void testPalindrome()
	{
		assertTrue(ArithmeticOperations.checkPalindrome(1212));
		
	}
	@Test
	@RepeatedTest(5)
	public void testPostive()
	{
		assertTrue(ArithmeticOperations.isPositive(12));
	}
	
	
	@ParameterizedTest
	@ValueSource(ints= {2,3,0,7,8})
	public void checkPositive(int no)
	{
		assertTrue(ArithmeticOperations.isPositive(no));
	}
	
	@ParameterizedTest
	@CsvSource({"123,false","121,true"})
	public void checkPalindrome(int no,boolean status)
	{
		//assertTrue(ArithmeticOperations.checkPalindrome(no));
	boolean exp=ArithmeticOperations.checkPalindrome(no);
	assertEquals(status,exp);
		
	}
	
	@ParameterizedTest
	@EnumSource(TimeUnit.class)
	public void testForEnums(TimeUnit t)
	{
		System.out.println(t);
	}
	
	
	@ParameterizedTest
	@MethodSource("getWords")
	void withMethodSource(String word) {
		System.out.println(word);
	}

	private static String[] getWords() {
		String s = "Hello! How are you?";
		return s.split(" ");
	}

}
