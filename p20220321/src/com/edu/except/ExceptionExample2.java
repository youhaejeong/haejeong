package com.edu.except;

import java.util.Calendar;
import java.util.Scanner;

//class String2 extends String{
//public final String{}
//상불가능한 클래스 
//}

public class ExceptionExample2 {
	public static void main(String[] args) {

		// 최상위 클래스 Object
		Object obj = new String();
		obj = new Scanner(System.in);
		obj = Calendar.getInstance();

		obj = new Object();
		System.out.println("obj의 해시코드: " + obj.hashCode());

		// Exception
		try {
			Class.forName("java.lang.String");
		} catch (ClassNotFoundException e1) {
//			e1.printStackTrace();
			System.out.println("해당 클래스가 존재하지 않습니다");
		}
		// RuntimeException //코드상으로 아무런 문제가 없으나 실행했을대 오류가 남

		String str = null;

		try {
			str.charAt(0); // CharSequence interface의 추상메소드
			System.out.println(str.toString());
		} catch (NullPointerException e) {
			System.out.println("nullpoint 예외 발생");
			e.printStackTrace(); // 에러의 종류를 보여줌
		}
//		parseInt
		String nums1 = "100";// 숫자 문자열
		String nums2 = "200";// 숫자 문자열
		int num1, num2;
		try {
			num1 = Integer.parseInt(nums1); // int 로 변환
			num2 = Integer.parseInt(nums2); // int 로 변환

			str.charAt(0);
//	catch (Exception e) 모든얘외에해닿ㄴ처ㅣ
		} catch (NumberFormatException e) {
			num1 = 0;
			num2 = 0;
		} catch (Exception e2) {
			System.out.println("상위의 예외발생...");
		}
//		System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));

//		showError();

		System.out.println("===end of prog===");
	}// end of main()

	public static void showError1() throws ClassNotFoundException {

		Class.forName("java.lang.String");
	}

//	public static void showError() {
//		try {
//			Class.forName("java.lang.String");
//		} catch (ClassNotFoundException e) {
////			e.printStackTrace();
//			System.out.println("예외 발생.");
//		}

}
