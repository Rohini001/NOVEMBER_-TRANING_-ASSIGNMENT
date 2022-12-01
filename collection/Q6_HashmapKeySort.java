package com.example.assigment.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

class City {
	String name;
	int population;

	public City(String name, int population) {
		super();
		this.name = name;
		this.population = population;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

}

public class Q6_HashmapKeySort {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("Pune", 10221);
		map.put("Nagpur", 32445);
		map.put("Mumbai", 3456);
		map.put("Thane", 6578);
		map.put("Bangalore", 2435);

		Iterator<String> itr = map.keySet().iterator();
		System.out.println("Before Sorting");
		while (itr.hasNext()) {
			String key = itr.next();
			System.out.println("City Name :" + key + "   Population :" + map.get(key));
		}

		TreeMap<String, Integer> tm = new TreeMap<>();
		tm.putAll(map);
		Iterator it = tm.keySet().iterator();
		System.out.println("After Sorting");
		while (it.hasNext()) {
			String key = (String) it.next();
			System.out.println("City Name :" + key + "   Population :" + map.get(key));
		}
	}

}
