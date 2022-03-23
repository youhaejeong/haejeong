package p20220322.exercise;

import java.util.Scanner;

//정수형 배열 선언하고 사용자로 세개의 정수값을 입력받아서 배열에 저장 제일 큰값을 구하느 ㄴ코드를 작성
public class Exam3 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int[] intAry = new int[3]; //배열수만큼 반복 

		for (int i = 0; i < intAry.length; i++) {
			System.out.println("정수를 입력하세요..");
			intAry[i] = scn.nextInt();
		}
//배열에 값이 3개 저장
		int max = intAry[0];
		for (int i = 0; i < intAry.length; i++) {
			if (max < intAry[i]) {
				max = intAry[i];

			}
		}
		System.out.println("최대값은=> "+max);
	}
}
