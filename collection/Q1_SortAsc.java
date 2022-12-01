package com.example.assigment.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q1_SortAsc {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Rohini");
		list.add("Mohini");
		list.add("Bhushan");
		list.add("Shivansh");
		list.add("Omkar");
		
		Collections.sort(list);
		System.out.println("Soretd list in Ascending order :"+list);
	
	}

}
