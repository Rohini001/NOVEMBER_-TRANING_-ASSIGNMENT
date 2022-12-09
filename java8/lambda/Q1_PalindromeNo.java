package com.example.assigment.java8.lambda;
import java.util.Scanner;
import java.util.stream.IntStream;

@FunctionalInterface
interface Palindrome{
	String isPalindrome(String str);
}

public class Q1_PalindromeNo {

	static String reverse="";
	public static void main(String[] args) {
		
		System.out.println("Enter number -");
		Scanner sc = new Scanner(System.in);
		String next = sc.next();
		Palindrome p = (s) -> {
			for (int i = s.length() - 1; i >= 0; i--) {
				reverse = reverse + s.charAt(i);
			}
			return reverse;
		};

		String palindrome = p.isPalindrome(next);
		if (palindrome.equalsIgnoreCase(reverse)) {
			System.out.println("It is Palindrome");
		} else {
			System.out.println("It is not Palindrome");
		}

	}
}