package com.example.assignment.tdd.basics;

public class Q6_NoDivisibleBy7 {
	public long add() {
		int sum = 0;
		for (int i = 100; i <= 200; i++) {
			if (i % 7 == 0)
				sum = sum + i;
		}
		return sum;
	}

	public static void main(String[] args) {
		Q6_NoDivisibleBy7 nd = new Q6_NoDivisibleBy7();

		long n = nd.add();
		System.out.println(n);
	}
}
