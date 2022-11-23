package com.example.assignment.array;

public class ThirdMaxNum {

	public static int getThirdMax(int a[], int total) {
		int temp;
		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[total - 3];

	}

	public static void main(String[] args) {
		int a[] = { 10, 50, 60, 20, 5 };
		int max = getThirdMax(a, 5);
		System.out.println("3rd Max Number :" + max);
	}

}
