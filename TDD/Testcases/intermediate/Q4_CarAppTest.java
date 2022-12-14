package com.example.assignment.tdd.intermediate;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Q4_CarAppTest {

	Q4_CarApp car = new Q4_CarApp();

	@Test
	public void test_ShouldReturn_Book_AsOutput() {

		int count = car.NoofCarSold();
		assertEquals(count, 7);

	}
}
