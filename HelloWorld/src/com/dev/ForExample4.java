package com.dev;

public class ForExample4 {
	public static void main(String[] args) {
		//1~10까지 수중에서 짝수의 값 => evenSum, 홀수의 값 =>oddSum
		int evenSum ,oddSum; //변수선언
		evenSum = oddSum = 0;// 변수에 초기값을 할당(초기화)
		//int startCnt = 1;
		//int lastCnt = 10;
		for (int i =1; i <= 10; i++) {//i는 1부터 10까지 1씩 늘어가겠습니다 증감이 없을때 무한 반복임 for안에 지문은 그냥 외워둘것 
			if (i % 2 ==1) {
				oddSum += i; //oddSum = oddSum + i;
			} else {
				evenSum += i;//evenSum = evenSum + i;
			}
			
		}
		System.out.println("홀수의 합: " + oddSum + ", 짝수의 합: "+ evenSum);
		
		
	}

}
