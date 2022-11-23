package com.example.assigment.oops;

public class Triangle implements Shape {

	public void area(double vertexA, double vertexB, double vertexC) {
		double areaOfTriangle = ((vertexB - vertexA) * (vertexC / 2));
		System.out.println("Area of Triangle :" + areaOfTriangle);
	}

}
