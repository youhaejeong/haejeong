package com.edu;

import java.util.Scanner;

public class MathExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요");
		double num1 = scn.nextDouble();
		System.out.println("두번째 숫자를 입력하세요");
		double num2 = scn.nextDouble();
		System.out.println("두수의 합은" + (num1 + num2) + "입니다.");
		System.out.println("두수의 차는"+ (num1 - num2) + "입니다");
		System.out.println("두수의 곱은" + (num1 * num2) + "입니다");
		System.out.println("두수의 몫은" +(int) (num1 / num2) + "입니다");
		System.out.println("나눈 나머지는" + (num1 % num2) +"입니다");
	}

}
