package com.dev;

import java.util.Scanner;

public class ForExample3 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// 입력받는 두 수를 num1, num2
		// 둘 사이의 값을 더하기
		int num1, num2;

		System.out.println("첫번쨰 수를 입력하세요");
		num1 = scn.nextInt();

		System.out.println("두번째 값을 입력하세요.");
		num2 = scn.nextInt();

		int sum = 0;

		for (int i = num1; i <= num2; i++) {
			sum += i;

		}
		System.out.println(num1 + " 부터 " + num2 + "까지의 합 :" + sum);
	}
}
