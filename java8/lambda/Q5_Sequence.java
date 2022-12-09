package com.example.assigment.java8.lambda;

import java.util.Scanner;

@FunctionalInterface
interface CheckSeq {
	abstract void print(String s);
}

public class Q5_Sequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sequence: ");
		String str = sc.next();

		CheckSeq cs = (s) -> {
			String[] se = s.split(",");
			int temp = Integer.parseInt(se[0]), n, flag = 0;
			System.out.print(temp);
			for (int i = 1; i < se.length; i++) {
				n = Integer.parseInt(se[i]);
				if (temp + 1 == n) {
					temp = temp + 1;
					// System.out.println(n);
					flag++;
				} else {
					if (flag > 0) {
						System.out.print("-" + temp + ",");
						flag = 0;
						temp = n;
						System.out.print(temp);
					} else {
						temp = n;
						System.out.print("," + temp);
					}

				}

				if (i == se.length - 1) {
					if (flag > 0) {
						System.out.println("-" + temp);
					} else {
						System.out.println("," + temp);
					}
				}
			}
		};
		cs.print(str);
	}

}

