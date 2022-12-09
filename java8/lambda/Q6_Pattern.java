package com.example.assigment.java8.lambda;

import java.util.Scanner;

@FunctionalInterface
interface PatternInterface {
	public void displayPattern(int input);
}

public class Q6_Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Letter to print the pattern");
		String str = sc.next().toUpperCase();
		char ch = str.charAt(0);
		int row = ch - 65;
		PatternInterface p = (r) -> {
			System.out.println("Print pattern: " + (r));

			int alphabet = 65;
			for (int i = 0; i <= row; i++) {

				for (int j = 0; j <= row - i; j++) {
					System.out.print((char) (alphabet + j));
				}

				for (int k = 1; k <= i * 2 - 1; k++) {
					System.out.print(" ");
				}

				for (int l = row - i; l >= 0; l--) {

					if (l != row)
						System.out.print((char) (alphabet + l));
				}
				System.out.println();
			}

		};
		p.displayPattern(row);
	}
}
