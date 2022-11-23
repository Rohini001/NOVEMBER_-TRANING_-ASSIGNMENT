package com.example.assignment.array;

public class DuplicateElement {

	public static void main(String[] args) {
		int[] a = new int[] { 12, 24, 56, 42, 17, 24, 12,42 };
		int count = 0;
		System.out.println("Duplicate elements :");
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
					System.out.println(a[i]);
					break;
				}
			}
		}
		System.out.println("Count of duplicate numbers :" + count);
	}

}
