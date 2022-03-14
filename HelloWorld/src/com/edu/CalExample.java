package com.edu;

import java.util.Scanner;

public class CalExample {
	public static void main(String[] args) {
		// 초(ex:100초) 입력 -> 시/분/초로 변경하기
		Scanner scn = new Scanner(System.in);
//		int hour, minute, second, inputval //1시간 3600초
		int inputVal = scn.nextInt(); //  슬라이스가 나누기 퍼센트가 나머지
		int hour = inputVal / 3600;  // 5000/3600 => 1시간
		int minute = (inputVal % 3600) / 60; // 1400 / 60 => 23분
		int second = (inputVal % 3600) % 60;  // 1400 % 60 => 20초
		System.out.println(inputVal +"초단위 입력");
		System.out.println(hour + "시" + minute + "분" + second + "초");
		scn.close();
	}

}
