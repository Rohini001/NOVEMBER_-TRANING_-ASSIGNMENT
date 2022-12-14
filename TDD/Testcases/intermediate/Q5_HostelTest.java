package com.example.assignment.tdd.intermediate;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Q5_HostelTest {

	@Test
	public void test_ShouldReturn_String_AsOutput() 
	{
		 
		int count=Q5_Hostel.registeredhostel();
		assertEquals(count, 3);
		
	}
	
}
