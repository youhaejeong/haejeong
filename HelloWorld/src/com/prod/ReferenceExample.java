package com.prod;

public class ReferenceExample {
	public static void main(String[] args) {
		//대문자로 시작하면 클래스타입이라 보면됨
		//참조타입 vs 기본(데이터)타입
		int num1 = 10;   //리터럴
		int num2 = 10;   //
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num1 == num2);
		//int, double, (byte, short, long, float, char, boolean0)->byte, short, long 정수형 타입 크기가 다름
		
		
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		System.out.println(str1); ///123afc35  둘다 예시임
		System.out.println(str2); //12b3afcf5
		System.out.println(str1 == str2);//이때 flase가 뜨는데 그 이유는 str들이 주소값을 가지고있고 그것은 각기 다름
		System.out.println(str1.equals(str2)); //문자열을 비교할때는 equals를 사용함
	}

}
