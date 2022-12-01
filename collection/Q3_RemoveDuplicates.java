package com.example.assigment.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q3_RemoveDuplicates {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 3, 2));

		Set set = new HashSet<>();
		set.addAll(list);

		list.clear();
		list.addAll(set);
		Collections.sort(list);
		
		System.out.println("Sorted elements of list after removing duplicates :");
		for (Integer i : list) {
			System.out.println(i);
		}
	}

}
