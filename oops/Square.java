package com.example.assigment.oops;

public class Square implements Shape {

	public void area(double vertexA, double vertexB, double vertexC) {
		double areaOfSquare = (vertexB - vertexA) * (vertexB - vertexA);
		System.out.println("Area of Square :" + areaOfSquare);
	}

}
