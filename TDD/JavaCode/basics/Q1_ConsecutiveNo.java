package com.example.assignment.tdd.basics;

public class Q1_ConsecutiveNo {
	int consecutiveNumsSum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		return sum;
	}

	public static void main(String[] args) {
		Q1_ConsecutiveNo con = new Q1_ConsecutiveNo();
		int s = con.consecutiveNumsSum(10);
		System.out.println(s);
	}

}
