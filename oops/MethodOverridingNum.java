package com.example.assigment.oops;

import java.util.Scanner;

class Override {
	int max(int a, int b) {
		if (a > b)
			return a;
		else
			return b;
	}

}

public class MethodOverridingNum extends Override {

	int max(int a, int b) {
		if (a > b)
			return a;
		else
			return b;
	}

	public static void main(String[] args) {
		MethodOverridingNum num = new MethodOverridingNum();
		System.out.println("Maximum of 3 and 4 is :"+num.max(3, 4));

		maximumOfNnum();
	}

	private static void maximumOfNnum() {
		int n, max;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of elements :");
		n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements :");
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		max = a[0];
		for (int i = 0; i < n; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		System.out.println("Maximum of N numbers is:" + max);
	}

}
