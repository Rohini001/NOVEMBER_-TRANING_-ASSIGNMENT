package com.example.assignment.array;

public class RemoveNotPalindromeString {

	private static void printOnlyPalindrome(String str) {
		/*
		 * String oldString = str; StringBuilder builder = new StringBuilder(str); if
		 * (builder.reverse().toString().toLowerCase().equals(oldString.toLowerCase()))
		 * { System.out.println(oldString); }
		 */
		int strLength = str.length();
		String reverseStr = "";
		for (int i = strLength - 1; i >= 0; --i) {
			reverseStr = reverseStr + str.charAt(i);
		}
		
		if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
			System.out.println(str);
		}
	}

	public static void main(String[] args) {

		String[] stringArray = { "madam", "rohini", "sanas", "level", "Bhushan" };
		System.out.println("Palindrome Strings are :");
		for (int i = 0; i < stringArray.length; i++) {
			printOnlyPalindrome(stringArray[i]);
		}

	}
}
