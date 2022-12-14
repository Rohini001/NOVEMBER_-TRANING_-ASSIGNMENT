package com.example.assignment.tdd.basics;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Q1_ConsecutiveNoTest {

	Q1_ConsecutiveNo sut = new Q1_ConsecutiveNo();

	@Test
	public void consecutiveNumsSumTest01() {

		assertEquals(55, sut.consecutiveNumsSum(10));
	}

	@Test
	public void consecutiveNumsSumTest02() {

		assertEquals(0, sut.consecutiveNumsSum(0));
	}

	@Test
	public void consecutiveNumsSumTest03() {

		assertEquals(45, sut.consecutiveNumsSum(9));
	}

}
