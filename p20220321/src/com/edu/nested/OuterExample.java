package com.edu.nested;

public class OuterExample {
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.method1();
		outer.method3();
		System.out.println("======================");
		outer.method4();
		
		
		System.out.println("=====<Inner>=====");
		Outer.Inner inner = outer.new Inner(); //멤버클래스 호출할때 호출 방식이 다름 (규칙임 )
		inner.method2();
	}

}
