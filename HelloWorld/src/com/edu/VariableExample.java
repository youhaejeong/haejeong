package com.edu;

public class VariableExample {
	public static void main(String[] args) {
		//변수의 타입.
		int num1 = 100; //int 정수
		double num2 = 10.5; //double은 소수점까지 표현.
		double result =(double) num1 * num2; // 인트형은 4바이트 필요 더블은 8바이트가 필요함 //인트형 변수를 소수점까지 표현하겠음 하는것이 (double)
		// 자동형변환(promotion): 작은범위 -> 큰범위.
		//강제형변환: 큰범위 -> 작은범위
		System.out.println("결과: " + result);
		//강제형변환(casting): 큰범위 -> 작은범위
		int val1 = 100;
		double val2 = 20.5;
		int sum = val1 +(int) val2;
		System.out.println("결과: " + sum);
		
		int n1 = 11;
		int n2 = 3;
		
		double n3 = (double) n1 / n2; // 10/4 =>2.5 //연산하는 시점에 어떤 값인지에 따라 소수점까지 표현이 되고 안되고
		System.out.println("나눈 결과:" + n3);
		
		//나머지 10을 3으로 나눈 나며지 => 1  %
		int n4 = n1 % n2;
		System.out.println("나머지: " + n4);
		
		
		//짝수, 홀수를 보고싶을때 
		if(n1 % 2 == 1) {
			System.out.println(n1 + "의 값은 홀수니다.");
		}
		
	}

}
