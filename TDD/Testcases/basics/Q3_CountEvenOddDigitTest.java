package com.example.assignment.tdd.basics;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Q3_CountEvenOddDigitTest {
	Q3_CountEvenOddDigit coedt = new Q3_CountEvenOddDigit();

	@Test
	public void text_GivenNo_ShoudReturn_countevenodd() {
		String result = coedt.countevenodd();
		assertEquals(result, 4 + "even digit" + 5 + "odd_count");
	}
}
