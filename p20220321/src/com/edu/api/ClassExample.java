package com.edu.api;

import java.lang.reflect.Method;

public class ClassExample {
	public static void main(String[] args) {

		// String,System,Member => Class가 관리 (대문자 씨임

		Class cls = String.class;
		try {
			cls = Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(cls.getName());
		System.out.println(cls.getSimpleName());
		Method[] methods = cls.getMethods();
		for (Method met : methods) { //받아오는 만큼 반복쓰 받아온값을 met를 통해 반복쓰
			System.out.println("메소드이름: "+met.getName());
		}
		
		cls =Member.class;
		String path =cls.getResource("ClassExample.class").getPath(); //같은 경로에 있는것을 출력 
		System.out.println(path);
		
	}

}
