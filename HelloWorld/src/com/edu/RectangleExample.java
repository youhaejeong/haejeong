package com.edu;

import java.util.Scanner;

public class RectangleExample {
	public static void main(String[] args) {
		//가로,세로, 길이 입력 -> 너비계산
		Scanner scn = new Scanner(System.in);
		int xLength = scn.nextInt();
		System.out.println("가로 길이:" + xLength);
		int yLength = scn.nextInt();
		System.out.println("세로 길이:" + yLength);
		int area = xLength * yLength;
		System.out.println("계산(너비) 결과:" + area);
		
		scn.close();
		
				
	}

}
