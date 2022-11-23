package com.example.assignment.strings;

import java.util.Scanner;

public class StrInsertAtIndex {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter first string :");
		String firstStr = scn.nextLine();
		System.out.println("Enter second string :");
		String secondStr = scn.nextLine();
		System.out.println("Enter index :");
		int index = scn.nextInt();

		String str = new String();

		for (int i = 0; i < firstStr.length(); i++) {
			str += firstStr.charAt(i);
			if (i == index) {
				str += secondStr;
			}
		}
		System.out.println("String After insertion :"+str);
	}

}
