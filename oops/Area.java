package com.example.assigment.oops;

import java.util.Scanner;

public class Area {

	void area(int a) {
		System.out.println("Area of Square :" + a * a);
	}

	void area(int a, int b) {
		System.out.println("Area of Reactangle :" + a * b);
	}

	void area(int a, int b, int c) {
		System.out.println("Area of Triangle :" + (a * b) / 2);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input side1: ");
		int s1 = in.nextInt();
		System.out.print("Input side2: ");
		int s2 = in.nextInt();
		System.out.print("Input side3: ");
		int s3 = in.nextInt();
		Area a = new Area();
		a.area(s1);
		a.area(s1, s2);
		a.area(s1, s2, s3);
		System.out.print("Is the said sides form a triangle: " + isValidTriangle(s1, s2, s3));
	}

	public static boolean isValidTriangle(int a, int b, int c) {
		return (a + b > c && b + c > a && c + a > b);
	}
}
