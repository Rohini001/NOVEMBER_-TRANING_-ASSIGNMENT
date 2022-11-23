package com.example.assignment.array;

import java.util.Collections;
import java.util.Vector;

public class SortArrBasisofUnitPlace {

//	public static void main(String[] args) {
//		int a[] = new int[] { 10, 2, 3, 41, 12, 13, 19, 81, 9 };		
//	}

	static void Sort(Vector<Integer> m, int n) {
		Vector<Integer> v1 = new Vector<>();
		Vector<Integer> v2 = new Vector<>();
		Vector<Integer> v3 = new Vector<>();

		int i;

		for (i = 0; i < n; i++) {

			// If elements are even and divisible by 10
			if (m.get(i) % 10 == 0)
				v1.add(m.get(i));

			// If number is even but not divisible by 5
			else if (m.get(i) % 2 == 0)
				v2.add(m.get(i));
			else
				// If number is odd
				v3.add(m.get(i));
		}

		Collections.sort(v1, Collections.reverseOrder());

		for (int ii = 0; ii < v1.size(); ii++) {
			System.out.print(v1.get(ii) + " ");
		}
		for (int ii = v2.size() - 1; ii >= 0; ii--) {
			System.out.print(v2.get(ii) + " ");
		}
		for (int ii = 0; ii < v3.size(); ii++) {
			System.out.print(v3.get(ii) + " ");
		}
	}


	public static void main(String[] args) {
	
		Vector<Integer> arr = new Vector<>();
		arr.add(10);
		arr.add(2);
		arr.add(3);
		arr.add(41);
		arr.add(12);
		arr.add(13);
		arr.add(19);
		arr.add(81);
		arr.add(9);
		int N = arr.size();

		Sort(arr, N);
	}
}


