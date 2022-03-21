package com.edu.Shape;

public class Circle extends Shape {
	private double radius;

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return radius * radius * 3.14;
	}

}
