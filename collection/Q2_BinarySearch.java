package com.example.assigment.collection;

public class Q2_BinarySearch {

	public static void binarySearch(int arr[], int first, int last, int key) {
		int mid = (first + last) / 2;
		while (first <= last) {
			if (arr[mid] < key) {
				first = mid + 1;
			} else if (arr[mid] == key) {
				System.out.println("Element is found at index: " + mid);
				break;
			} else {
				last = mid - 1;
			}
			mid = (first + last) / 2;
		}
		if (first > last) {
			System.out.println("Element is not found!");
		}
	}

	public static void main(String[] args) {

		int arr[] = new int[] { 5, 10, 15, 20 };
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
		
		int key = 10;
		int last = arr.length - 1;
		binarySearch(arr, 0, last, key);
	}

}
