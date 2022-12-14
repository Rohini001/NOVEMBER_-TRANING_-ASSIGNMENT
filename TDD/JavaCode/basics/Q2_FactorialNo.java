package com.example.assignment.tdd.basics;

public class Q2_FactorialNo {
	public long factorial(int n) {
		long fact = 1;

		while (n > 0) {
			fact = fact * n;
			n = n - 1;
		}
		return fact;
	}

	public static void main(String[] args) {
		Q2_FactorialNo fne = new Q2_FactorialNo();
		long fact = fne.factorial(5);
		System.out.println("Factorial is " +fact);
	}

}
