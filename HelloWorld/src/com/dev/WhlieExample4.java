package com.dev;

import java.util.Scanner;

public class WhlieExample4 {
	public static void main(String[] args) {
		// 은행 계좌를 만들어서 1: 입금, 2:출금 3:종료
		// 입급일 경우: 입금액을 입력하세요.....account 값을 누적
		// 출금일 경우: 출금액을 입력하세요....account 값을 차감
		// 종요일 경우: 프로그램 종료
		Scanner scn = new Scanner(System.in);
		// System.out.println("1:입금, 2:출금, 3종료");
		// int menu = scn.nextInt();
		int account = 0;
		while (true) {
			System.out.println("1:입금, 2:출금, 3종료");
			int menu = scn.nextInt();
			if (menu == 1) {// System.out.println("1:입금, 2:출금, 3종료");
				// System.out.println("1:입금, 2:출금, 3종료");
				System.out.println("입금액을 입력하세요");
				int inputVal = scn.nextInt();
				account += inputVal;
				System.out.println("현재 잔액은" + account + "입니다.");
			} else if (menu == 2) {
				//마이너스 통장이 안되도록....
				System.out.println("출금액을 입력하세요");
				int inputVal = scn.nextInt();
				if (account < inputVal ) {
					System.out.println("잔액이 부족합니다 현재잔액은" + account +"입니다");
					continue;
				}
				account -= inputVal;
				System.out.println("현재 잔액은" + account + "입니다.");
			} else if (menu == 3) {
				System.out.println("종료합니다.");
				break;
			}

		} scn.close();
	}
 
}
