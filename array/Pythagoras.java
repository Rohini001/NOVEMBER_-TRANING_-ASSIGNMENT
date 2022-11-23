package com.example.assignment.array;

import java.util.Scanner;

public class Pythagoras {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter size of array :");
		int n = sr.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter array elements :");
		for (int i = 0; i < n; i++) {
			arr[i] = sr.nextInt();
		}
		int a, b, c;
		boolean found= false;
		for (int i = 0; i < n - 2; i++)// select an element
		{
			for (int j = i + 1; j < n - 1; j++)// select an element in front of the considered element
			{
				for (int k = i + 2; k < n; k++)// this element will be one ahead of the previously selected element in
												// the just outer loop
				{
					a = arr[i];
					b = arr[j];
					c = arr[k];
					if (a * a + b * b == c * c) {
						found= true;
						System.out.println("Pythagoras template :"+a + "  " + b + "  " + c);
					}
				}
			}
		}
		if(!found)
			System.out.println("Not found !");
		
	}

}
