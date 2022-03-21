package com.edu.Shape;

public class ShapeExample {
	public static void main(String[] args) {
		Shape s1 = new Ractangle();
		Shape s2 = new Circle();
		Shape s3 = new Triangle();

		if (s1 instanceof Ractangle) {
			Ractangle r1 = (Ractangle) s1;
			r1.setHeight(12.3);
			r1.setWidth(7.8);
			System.out.println("==========================="); 
			System.out.println(r1.getArea());
		}
		
		if (s2 instanceof Circle) {
			Circle r1 = (Circle) s2;
			r1.setRadius(5.5);
			System.out.println("===========================");
			System.out.println(r1.getArea());
			
		}
		if(s3 instanceof Triangle) {
			Triangle r1 = (Triangle) s3;
			r1.setBase(5.2);
			r1.setHeight(2.3);
			System.out.println("===========================");
			System.out.println(r1.getArea());
		}
	}

}
