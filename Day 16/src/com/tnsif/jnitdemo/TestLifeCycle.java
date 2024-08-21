package com.tnsif.jnitdemo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class TestLifeCycle {
	
	@BeforeAll
	public static void OpenBrowser()
	{
		System.out.println("Browser is opened");
	}
	
	@BeforeEach
	public void OpenCalc()
	{
		System.out.println("Calc is opened");
	}
	
	@AfterAll
	public void CloseBrowser()
	{
		System.out.println("Browser is Closed");
	}
	
	@AfterEach
	public void CloseCalc()
	{
		System.out.println("Calc is Closed");
	}
	
	@Test
	public void add() {
		System.out.println("Addition is executed");
	}
	
	@Test
	public void sub()
	{
		System.out.println("Subtraction is executed");
	}
	

}
