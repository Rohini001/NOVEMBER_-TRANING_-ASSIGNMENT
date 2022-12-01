package com.example.assigment.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q4_ItemsDescSort {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("Washing Machine","TV","Laptop","Refrigerator"));

		Set set = new HashSet<>();
		set.addAll(list);

		list.clear();
		list.addAll(set);
		Collections.sort(list,Collections.reverseOrder());

		System.out.println("Sorted elements of list after removing duplicates :");
		for (String i : list) {
			System.out.println(i);
		}
	}

}
