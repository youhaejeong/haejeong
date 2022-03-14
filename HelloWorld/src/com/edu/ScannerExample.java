package com.edu;

import java.util.Scanner;

class ScannerExample {   // com.edu.ScannerExample
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in); //대소문자 구분! System.in 은 키보드 입력 (키보드로 입력한것을 읽어드림)
		
		
		System.out.println("첫번째 숫자를 입력하세요..");
		int val = scn.nextInt();//사용자가 입력한 값을 읽어드림
		System.out.println("두번째 숫자를 입력하세요..");
		int val2 = scn.nextInt();
		//val.val2의 값을 합한 결과를 담을 변수 선헌하고 결과를 저장
		int result = val + val2;
		
		System.out.println("두수의 합은" + result + "입니다.");
		
		System.out.println("두수의 합은" + (10 + 20) + "입니다.");
		
//		if(val % 2 == 0) {
//			System.out.println("짝수입니다.");
//		}
//		
//		if(val % 2 == 1) {
//			System.out.println("홀수입니다.");
//		}
		scn.close();
		
		
		
		
	}

}
