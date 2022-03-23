package com.edu.generic;

import java.util.ArrayList;

public class BoxExample {
	public static void main(String[] args) {
//		Box box = new Box();
//		box.setObj("즐거운 자바");
//		String result =(String)box.getObj(); //String -> String 괄호안의 스트링은 캐스팅임
//		System.out.println(result);
//		
//		Integer result1 =(Integer) box.getObj(); //String -> Integer
//		System.out.println(result1); //타입이 다르기때문에 실행이 안됨 

		Box<String> stringBox = new Box<String>();
		stringBox.setObj("즐거운 자바");
		String result = stringBox.getObj();
		System.out.println(result);

		Box<Integer> intBox = new Box<Integer>();
		intBox.setObj(100);
		Integer result1 = intBox.getObj();
		System.out.println(result1);

		ArrayList<Integer> intAry = new ArrayList<Integer>();
		
	}
}
