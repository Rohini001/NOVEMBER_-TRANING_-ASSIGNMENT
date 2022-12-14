package com.example.assignment.tdd.basics;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Q6_NoDivisibleBy7Test {

	Q6_NoDivisibleBy7 q = new Q6_NoDivisibleBy7();

	@Test
	public void NoDivisibleBy7() {
		assertEquals(q.add(), 2107);
	}
}
