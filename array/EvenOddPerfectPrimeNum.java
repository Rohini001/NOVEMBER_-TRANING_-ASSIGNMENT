package com.example.assignment.array;

import java.util.Scanner;

public class EvenOddPerfectPrimeNum {

	public static void main(String[] args) {

		int[] arr = new int[5]; // { 2, 3, 5, 1, 6, 7, 9 };
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the array elements :");
		for (int i = 0; i < 5; i++) {
			arr[i] = scn.nextInt();
		}
		// Even Number
		System.out.println("The Even Elements from the array: ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.print(arr[i] + " ");
			}
		}

		// Odd Number
		System.out.println(" ");
		System.out.println("The Odd Elements from the array: ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				System.out.print(arr[i] + " ");
			}
		}

		/// Prime number
		System.out.println("\nPrime numbers in the array :");
		int count = 0;
		for (int j = 0; j < 5; j++) {
			for (int k = 1; k <= arr[j]; k++) {
				if (arr[j] % k == 0)
					count++;
			}
			if (count == 2)
				System.out.println(arr[j]);
			count = 0;

		}

		// Perfect number
		System.out.println(" ");
		int sum = 0, perfectNum = 0;
		for (int i = 0; i < arr.length; i++) {
			perfectNum = (int) Math.sqrt(arr[i]);
			sum = perfectNum * perfectNum;

			/*
			 * for (int j = 1; j < arr[i]; j++) { if (arr[j] % j == 0) { sum += j; }
			 */

			if (sum == arr[i])
				System.out.println("Perfect Number :" + arr[i]);
//				else
//					System.out.println("Not Perfect Number :" + arr[i]);
		}
	}
}
