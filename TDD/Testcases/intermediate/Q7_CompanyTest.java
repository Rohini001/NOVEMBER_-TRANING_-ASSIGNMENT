package com.example.assignment.tdd.intermediate;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Q7_CompanyTest {
	Q7_Company app = new Q7_Company();

	@Test
	public void test_countemployee_return_count_asoutput() {
		int countemp = app.countemployee();
		assertEquals(countemp, 5);
	}
}