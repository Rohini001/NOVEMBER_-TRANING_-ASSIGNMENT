package com.example.assigment.oops;

import java.util.Objects;
import java.util.Scanner;

public class MethodOverriding {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter first string :");
		String s1 = scn.nextLine();
		System.out.println("Enter second string :");
		String s2 = scn.nextLine();

		String str1 = new String(s1);	
		String str2 = new String(s2);
		String str3 = new String(s1);
		System.out.println("Comparing " + str1 + " and " + str2 + " : " + Objects.equals(str1, str2));
		System.out.println("Comparing " + str2 + " and " + str3 + " : " + Objects.equals(str2, str3));
	}

}
