package com.edu;

public class OperatorExample {
	public static void main(String[] args) {
		int num1, num2, result;
		
		num1 = 10;
		num2 = 100; //110
		
		num1 += 20; //130
		num2 -= 50; //80
		
		num1++; //31
		num2--; //49
		num2--; //48
		num1 >>= 2; //num1 = num1 >> 2;
		
		result = num1 + num2;
		System.out.println("result=> " + result);
		
		
		
		
		
		
		
		int myAge = 19;
		myAge =25;
		boolean isAdult = myAge > 20; //boolean은 참인지 거짓인지 알려줌 
		System.out.println(isAdult);
		
	
		
		if (isAdult) {
			System.out.println("성인입니다");
		} else {
			System.out.println("미성년입니다");
		}
		
		// 논리연산자 (보통 if와 같이 씀 
	}

}
