package com.edu;

import java.util.Scanner;

public class TemperatureExample {
	public static void main(String[] args) {
		// C = 5/9*(F-32) 화씨온도를 섭씨온도로 변경 규칙
		Scanner scn = new Scanner(System.in);
		
		System.out.println("화씨온도를 입력해주세요");
		double fDeg, cDeg; //변수 선언 꼭 해야함 
		
	    fDeg = scn.nextDouble();//사용자의 입력을 기다림 소수점까지 읽어드림요
	    
		
		
		//30.0 보다 크면 "오늘은 더운 날씨네요" 그 외는 "살만하네요"
		
		cDeg = (double) 5/9*(fDeg-32);
		System.out.println(cDeg);
				
				
		if (cDeg > 30.0) { //if ( 조건문 입력) { 참 아니면 거짓인 값이 나와야 함 
			System.out.println("오늘은 더운 날씨네요");
		} else {
			System.out.println("살만하네요");
		}
		scn.close();
		
	}

}
