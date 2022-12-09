package com.example.assigment.java8.lambda;

import java.util.Scanner;
import java.util.stream.IntStream;


@FunctionalInterface
interface CheckInterface {
	void check(int first);
}

@FunctionalInterface
interface EvenMethod {
	void isEven(int second);
	
}

@FunctionalInterface
interface OddMethod {
	void isOdd(int second);
}

@FunctionalInterface
interface Armstrong {
	void isArmstrong(int second);
}

@FunctionalInterface
interface MyPalindrome {
	void isPalindrome(String second);
}

public class Q3_Number {

	public static void main(String[] args) {
		boolean flag = false;

		do {
			System.out.println("Press 1 for Even No");
			System.out.println("Press 2 for odd No");
			System.out.println("Press 3 for armstrong No");
			System.out.println("Press 4 for palindrome No");
			//
			Scanner scn = new Scanner(System.in);
			System.out.println("Enter operation to perform");
			int firstInt = scn.nextInt();
			System.out.println("Enter the value-");
			int secondInt = scn.nextInt();

			CheckInterface ch = (n) -> {
				if (n == 1) {
					displayEven(secondInt);
				} else if (n == 2) {
					displayOdd(secondInt);
				} else if (n == 3) {
					displayArmstrong(secondInt);
				} else if (n == 4) {
					displayPalindrome(Integer.toString(secondInt));
				} else {
					System.out.println("Invalid choice");
				}
			};
			ch.check(firstInt);
			//
			flag = true;
		} while (flag);

	}

	//even number
	private static void displayEven(int secondInt) {
		
		EvenMethod even = (second) -> {
			if (second % 2 == 0)
				System.out.println("Number is EVEN");
			else
				System.out.println("Number is NOT Even");
		};
		even.isEven(secondInt);
	}

	//odd number
	private static void displayOdd(int secondInt) {
		OddMethod odd = (second) -> {
			if (second % 3 == 0)
				System.out.println("Number is ODD");
			else
				System.out.println("Number is NOT Odd");
		};
		odd.isOdd(secondInt);
	}

	// armstrong
	private static void displayArmstrong(int secondInt) {
		Armstrong armstrong = (second) -> {

			int originalNumber, remainder, result = 0;
			originalNumber = second;

			while (originalNumber != 0) {
				remainder = originalNumber % 10;
				result += Math.pow(remainder, 3);
				originalNumber /= 10;
			}

			if (result == second)
				System.out.println(second + " is Armstrong No.");
			else
				System.out.println(second + " is NOT Armstrong No.");

		};

		armstrong.isArmstrong(secondInt);

	}

	// palindrome
	private static void displayPalindrome(String secondInt) {
		MyPalindrome palindrome = (s) -> {
			boolean second = IntStream.range(0, secondInt.length() / 2)
					.noneMatch(i -> secondInt.charAt(i) != secondInt.charAt(secondInt.length() - i - 1));

			if (second)
				System.out.println(second + " is Palindrome");
			else
				System.out.println(second + " is NOT ");

		};

		palindrome.isPalindrome(secondInt);

	}
}