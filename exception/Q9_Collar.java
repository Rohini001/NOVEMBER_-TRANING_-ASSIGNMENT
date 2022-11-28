package com.example.assigment.exception;

import java.util.Scanner;

public class Q9_Collar {

	static int collarCount = 0;

	public static void getCollarDetails(float standardSize) {

		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.println("Enter collar size");
			Float collarSize = scanner.nextFloat();
			if (collarSize >= (standardSize - (standardSize * 2 / 100))
					&& collarSize <= (standardSize + (standardSize * 2 / 100))) {
				collarCount++;
			}
		}
		try {
			if (collarCount > 5) {
				System.out.println("Total collars with accepted standard deviation: " + collarCount);
			} else {
				throw new CollarStandardDeviateException("Collar are not satisfy the standard deviation rate.");
			}

		} catch (CollarStandardDeviateException e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {

		System.out.println("Enter the standard Collar size: ");
		Scanner sc = new Scanner(System.in);
		float standardSize = sc.nextFloat();
		getCollarDetails(standardSize);
	}
}

class CollarStandardDeviateException extends Exception {
	private static final long serialVersionUID = 1L;

	public CollarStandardDeviateException(String s) {
		super(s);
	}
}
