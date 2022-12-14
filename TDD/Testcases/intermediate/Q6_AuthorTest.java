package com.example.assignment.tdd.intermediate;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Q6_AuthorTest {
	Q6_Author t = new Q6_Author();

	@Test
	public void test_ShouldReturn_Book_AsOutput() {

		int count = t.bookcount("balaguruswamy");
		assertEquals(count, 3);

	}
}
