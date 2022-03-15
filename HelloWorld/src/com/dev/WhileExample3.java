package com.dev;

import java.util.Scanner;

public class WhileExample3 {
	public static void main(String[] args) {
		// 입력을 계속 입력할수 있도록..
		// -1 값을 입력하면 입력을 멈춤.
		// sum값에 입력...
		Scanner scn = new Scanner(System.in);// 스캐너 선언

		int sum = 0;// sum을 0으로 선언
		while (true) {
			System.out.println("숫자를 입력하세요");
			int inputVal = scn.nextInt();
			sum += inputVal;//sum += inputVal 일때 반복문일경우 인풋을 무한히 더함
			if (inputVal == -1) {
				break;
			} 
				sum += inputVal;//sum += inputVal 일때 반복문일경우 인풋을 무한히 더함
				System.out.println("합계는" + sum + "입니다.");

			

		}

	}
}
