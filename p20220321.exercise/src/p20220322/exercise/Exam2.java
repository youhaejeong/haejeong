package p20220322.exercise;

import java.util.*;

//정수형 변수 n1,n2를 선언하고 스캐너 클래스를 통해 두정수를 입력받은 후 큰수에서 작은 수를 나눈 결과값을 소수점 첫번째 까지 구하는 기능 
public class Exam2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n1, n2;
		double result;

		System.out.println("첫번째 값을 입력하세요..");
		n1 = scn.nextInt();
		System.out.println("두번째 값을 입력하세요..");
		n2 = scn.nextInt();

		if (n1 > n2) {
			result = n1 / (double) n2; // 정수 연산 하면 결과값도 정수 결과 정수 타입; 4바이트(정수) 8바이트(실수)
		} else {
			result = n2 / (double) n1;

		}
		System.out.printf("결과는=> %.1f", result);
	}

}
