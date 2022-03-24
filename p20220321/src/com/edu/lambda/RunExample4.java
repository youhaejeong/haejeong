package com.edu.lambda;

interface Runnable4 {
	public int run();
}

public class RunExample4 {
	public static void main(String[] args) {
		Runnable4 runnable = () -> {
			return (int) (Math.random() * 10);
		};
		int result =runnable.run();
		System.out.println(result);
		
		
		//함수적인 프로그램 작성 : 간단하게 표현(람다표현식) ()->      //람다식은 구현해야할 메소드가 하나일때만 가능
		
		//cosumer 매개값만 있고 리턴값이 없는 추상메소드를 가짐 
		//Consumer<T> void accopt<T> 객체 T를 받아 소비
		runnable = () -> {
			return (int) (Math.random() * 100);
		};
		result =runnable.run();
		System.out.println(result);
	}
}
