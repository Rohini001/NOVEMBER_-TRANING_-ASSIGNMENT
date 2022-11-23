package com.example.assignment.array;

public class SquareMatrix {

	public static void main(String[] args) {

		int square[][] = { { 1, 3, 5 }, { 2, 4, 6 } };
		System.out.println("Square Matrix: ");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(square[i][j] + " ");
			}
			System.out.println();
		}
	}

}
