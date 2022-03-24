package com.edu.lambda.cunsumer;

import java.util.function.*;

public class ConsumerExample {
	public static void main(String[] args) {

		// functional interface(함수적 인터페이스) :람다표현식 가능.
		Consumer<String> consumer = (String t) -> {
			System.out.println(t + " 출력합니다.");

		};
		consumer.accept("메세지를");

		BiConsumer<Integer, Integer> biCon = (t, u) -> {
			System.out.println("result => " + (t + u));
		};
		biCon.accept(20, 40);

	}
}
