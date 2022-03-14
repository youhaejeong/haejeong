package com.edu;

import java.util.Scanner;

public class CashExample {
	public static void main(String[] args) {
		// 2개의 값을 입력 
		Scanner scn =new Scanner(System.in);
	    int price, cash;
		System.out.println("가격을 입력하세요");
		price = scn.nextInt();
		System.out.println("손님이 낸 금액.");
		cash = scn.nextInt();
		
		System.out.println("부가세는" +  (price * 1/11) + "입니다.");
		int result = cash - price;
		System.out.println("거스름돈은" + result + "입니다"); //아웃 할때 조건을 괄호하여 해도 됨)
				
		
		//가격을 입력하세요..
		//price = ???.nextInt(); // 부가세 10퍼센트 5500원은 부가세가 포함된 금액
		// 손님이 낸 급액 
		//cash=???nextInt();  //
		//하나는 상품의 부가세, 하나는 거스름돈
	}

}
