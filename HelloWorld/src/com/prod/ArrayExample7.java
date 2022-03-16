package com.prod;

public class ArrayExample7 {
	public static void main(String[] args) {
		int num1 = 15;
		int num2 = 20;
		
		int temp = num1; //temp에 넘1의 값을 백업함
		num1 = num2; //이때 이 두가지만 설정하면 넘 1의 값이 사라짐
		
		
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
		
		//각각 변수 설정할때 뉴로 변수 선언후 실행
		//int[] numbers = new int [2];
		//numbers [0] = 15;
		//numbers [1] = 20;
		
		int[] numbers = {15, 20 };
		
		temp = numbers[0];
		numbers[0] = numbers[1];
		numbers[1] = temp;
		
		//int temp = numbers;
		//위치를 바꾸고 싶을때 
		System.out.println("바뀐 첫번쨰: " + numbers[0]);
		System.out.println("바뀐 두번쨰: " + numbers[1]);
	}

}
