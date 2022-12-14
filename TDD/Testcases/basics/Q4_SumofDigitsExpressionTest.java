package com.example.assignment.tdd.basics;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Q4_SumofDigitsExpressionTest {
	Q4_SumofDigitsExpression s = new Q4_SumofDigitsExpression();

	@Test
	public void test_sumOf_Expression1() {
		assertEquals(s.calculateSum("2+3+4"), 9);
	}

	@Test
	public void test_sumOf_Expression2() {
		assertEquals(s.calculateSum("2+5+4"), 11);
	}
}
