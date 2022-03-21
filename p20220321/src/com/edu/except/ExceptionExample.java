package com.edu.except;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample {
	public static void main(String[] args) {
		// 오류 : Error , Exception
		//compile error , runtime error(실행하는 시점에 에러를 알수있음 

		try {
		double result = 13 / 0;
		System.out.println("결과 : " + result);
		
		}catch (ArithmeticException e) {
//			e.printStackTrace();
			System.out.println("0으로 나눌수없습니다.");
		}
		Scanner scn =new Scanner(System.in);
				System.out.println("숫자를 입력하세요");
				try {
				int menu = scn.nextInt();
				}catch(InputMismatchException e) { //인포트 꼭 하기
					System.out.println("숫자를 입력 안하셨네요....");
				}
		System.out.println("end of prog");
	}
}
