package p20220321.exercise;

import java.util.Scanner;

public class Abc {
//배열은 포문을 쓴다, 2차원배원배열은 2중포문을 쓴다 
	
	static Scanner scn = new Scanner(System.in);

	// 메소드로 만드는 법
	public static void intAry(int ary[]) {

		for (int i = 0; i < ary.length; i++)
			ary[i] = scn.nextInt();

		for (int i = 0; i < ary.length; i++)
			System.out.println(ary[i]);

	}

	public static void main(String[] args) {
		System.out.println("배열은 ");
		int a = scn.nextInt();
		int[] ary = new int[a];
		intAry(ary);

	}
}
