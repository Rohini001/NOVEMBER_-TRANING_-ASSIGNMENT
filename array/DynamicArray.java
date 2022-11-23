package com.example.assignment.array;

import java.util.ArrayList;

public class DynamicArray {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		System.out.println("Array size before adding elements :"+al.size());
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println("The dynamic array is: " + al);
		System.out.println("Array size after adding elements :"+al.size());
	}

}
