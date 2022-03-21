package com.edu.Shape;

public class Triangle extends Shape {
	private double base;
	private double height;

	public void setBase(double base) {
		this.base = base;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double getArea() {
		return base * height / 2;
	}

}
