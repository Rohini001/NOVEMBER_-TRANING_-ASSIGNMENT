package com.example.assignment.strings;

import java.util.Scanner;

public class RemoveVowelsString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :");
		String s = sc.nextLine();
		String str = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != 'a' && s.charAt(i) != 'e' && s.charAt(i) != 'i' && s.charAt(i) != 'o'
					&& s.charAt(i) != 'u' && s.charAt(i) != 'A' && s.charAt(i) != 'E' && s.charAt(i) != 'I'
					&& s.charAt(i) != 'O' && s.charAt(i) != 'U') {
				str = str + s.charAt(i);
			}
		}
		System.out.println(str);
	}

}
