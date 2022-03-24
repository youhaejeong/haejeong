package com.edu.lambda.cunsumer;

import java.util.function.IntSupplier;

//스트림과 병렬처리할때 쓰임
public class SupplierExample {
	// Supplier 인터페이스 : 매개값이(X) -> 반환값(O)
	public static void main(String[] args) {

		IntSupplier intSup = () -> (int) (Math.random() * 10);

		int result = intSup.getAsInt();
		System.out.println("결과값은 " + result);
	}
}
