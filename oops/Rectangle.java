package com.example.assigment.oops;

public class Rectangle implements Shape {


	public void area(double vertexA, double vertexB, double vertexC) {
		double areaOfRectangle = (vertexB - vertexA) * vertexC;
		System.out.println("Area of Rectangle :" + areaOfRectangle);
	}

}
