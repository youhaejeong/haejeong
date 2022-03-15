package com.dev;

public class WhileExample2 {
	public static void main(String[] args) {
		//1~ 10까지의 수 중에서 짝수만 출력
		//while 구문 사용
		int i = 0;
		while (i <=10) {
			i++;
			if(i % 2 == 0) {
				System.out.println("짝수는: " + i);
				//i++;
			}
			//i++;
		}
	}

}
