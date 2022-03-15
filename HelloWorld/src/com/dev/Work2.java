package com.dev;

import java.util.Scanner;

public class Work2 {
	public static void main(String[] args) {
		// num1, num2,num3 에 값을 입력 받도록 한후 작은수 부터 큰수로 정렬
		Scanner scn = new Scanner(System.in);
		int num1,num2,num3;
		System.out.println("첫번째 수를 입력하세요");
		num1 = scn.nextInt();
		System.out.println("두번째 수를 입력하세요");
		num2 = scn.nextInt();
		System.out.println("세번째 수를 입력하세요");
		num3 = scn.nextInt();
		
		if (num1 < num2 && num2 < num3 ) {
			System.out.println(num3 + ">" + num2 + ">" + num1);
		} else if (num1 < num3 && num3 < num2) {
			System.out.println(num2 + ">" + num3 + ">" + num1);
		} else if (num2 < num1 && num1 < num3) {
			System.out.println(num3 + ">" + num1 + ">" + num2);
		} else if (num2 < num3 && num3 < num1) {
			System.out.println(num1 + ">" + num3 + ">" + num2);
		} else if (num3 < num2 && num2 < num1) {
			System.out.println(num1 + ">" + num2 + ">" + num3);
		} else if (num3 < num1 && num1 < num2) {
			System.out.println(num2 + ">" + num1 + ">" + num3);
		}
	}

}
