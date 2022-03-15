package com.dev;

import java.util.Scanner;

public class WhileExample {
	public static void main(String[] args) {
		// for
		for (int i = 1; i <= 5; i++) {
			System.out.println("i의 값 =>" + i);
		}
		// while
		int i = 1; // 초기화 while식 바깥에 초기값이 있음
		while (i <= 5) { // 와일 괄호 안에 조건문만 입력 //조건식
			System.out.println("i의 값 =>" + i);
			i++; // 증감식

		}

		int num = 0;
		while (true) {
			System.out.println("num의 값=>" + num );
	
			num++;
			if (num > 5) {
				break;//반복문을 빠져나옴
			}
		}
		
		
		//while
		while (true) {
			int rand = (int) (Math.random()*10)+1;
			System.out.println("임의의 생성된 값 = " + rand);
			if (rand == 8) {
				break;
			}
		}
		
		//수를 맞출때 까지 계속 반복.
		Scanner scn = new Scanner(System.in);
		int randomVal, userVal;
		while(true) {
			randomVal =(int)(Math.random()* 5)+ 1;
			System.out.println("임의 값을 입력하세요(1~5");
			userVal =scn.nextInt();
			if ( randomVal == userVal) {
				System.out.println("생성된임의값과 같습니다");
				break;
			}
		}
		
		System.out.println("end of prog");
	}

}
