package com.example.assigment.collection;

import java.util.Collections;
import java.util.Vector;

public class Q5_VectorSort {

	public static void main(String[] args) {

		Vector<Item> vec = new Vector<>();
		vec.add(new Item(3, "Refrigerator"));
		vec.add(new Item(1, "TV"));
		vec.add(new Item(4, "Laptop"));
		vec.add(new Item(2, "Washing Machine"));

		Collections.sort(vec);
		System.out.println(vec);
	}

}

class Item implements Comparable<Item> {
	int id;
	String name;

	public Item(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Item o) {

		return this.getId() - o.getId();
	}

}
