package com.example.assignment.tdd.basics;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Q2_FactorialNoTest {

	Q2_FactorialNo fact= new Q2_FactorialNo();
	
	@Test
	public void FactorialNoTest1() {
		assertEquals(120,fact.factorial(5));   
	}
	
	@Test
	public void FactorialNoTest2() {
		assertEquals(720,fact.factorial(6));   
	}
}
