package com.edu.abstracts;

public class Dog extends Animal  {
//추상클래스에 있는것을 기능하는것을 구현해야 오류가 없음
	
	public Dog() {
		super();
		System.out.println("Dog() 생성자 호출 ");
		
	}
	@Override
	public void eat() {
		System.out.println("멍멍이가 먹습니다.");

	}

	@Override
	public void speak() {
		System.out.println("멍멍멍");
	}

}
