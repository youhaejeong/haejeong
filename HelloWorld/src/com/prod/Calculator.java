package com.prod;//반환받고 싶을때 int같은 것 사용 미 반환 void

public class Calculator { // 클래스를 정의하는 부분 .

	double PI = 3.14;

	//        매개변수, 매개변수
	int add(int n1, int n2) {
		return n1 + n2;

	}
	// 반환 : int ,minus(메소드),v1,v2
	int minus(int v1, int v2) {
		return v1 - v2;

	}

	
	//사격형 넓이 계산
	double getRectArea(double x, double y) {
		return x * y;
	}
	
	//원의 넓이 계산..
	double getCircleArea(double radius) {
		return PI * radius  * radius;
		
	}

}

