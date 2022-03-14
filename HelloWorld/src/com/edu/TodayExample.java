package com.edu;

import java.util.Scanner;

// 이름을 입력받도록..(String)->scn.nextLine();
// 연락처입력..(String) ->scn.nextLine();
// 나이 입력..(int) -> scn.nextInt();
// 키 입력..(double) ->scn.nextDouble();

// 이름은 : ???
///연락처 : 010-2345-8456
//나이 :  26
// 키 :  167.4
public class TodayExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String name = scn.nextLine();
		System.out.println("이름은: " + name);
		
		System.out.println("연락처를 입력하세요");
		String number = scn.nextLine();
		System.out.println("연락처는: " + number);
		

		System.out.println("나이를 입력하세요");
		int Age = scn.nextInt();
		System.out.println("나이는: " + Age);
		

		System.out.println("키를 입력하세요");
		double High = scn.nextDouble();
		System.out.println("키는: " + High);

		System.out.println("몸무게를 입력하세요");
		double Weghit = scn.nextDouble();
		System.out.println("몸무게는: " + Weghit);

		if ((High - 100) * 0.9 < Weghit) {
			System.out.println("과체중");
		} else {
			System.out.println("저체중");
		}
		scn.close();

	}

}
