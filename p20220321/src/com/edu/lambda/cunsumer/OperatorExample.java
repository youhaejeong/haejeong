package com.edu.lambda.cunsumer;

import java.util.function.IntBinaryOperator;

//Operator :연산처리 결과
public class OperatorExample {
	public static void main(String[] args) {
		IntBinaryOperator ibo = (left, right) -> left + right;
		
		ibo = (num1, num2) -> num1 > num2 ? num1 : num2; // 기능. 
		//여기서 ?는 이게 맞나요 물어보는거 맞으면 왼쪽 아니면 오른쪽 값 출력쓰
		int result = minOrMax(ibo);
		System.out.println(result);
		
	}
	
	public static int minOrMax(IntBinaryOperator ibo) {
		
		int[] intAry = {45, 36,75};
		
		int result = intAry[0];
		
		for(int num: intAry) {
			result = ibo.applyAsInt(result, num);
		}
		return result;
	}

}
