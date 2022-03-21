package com.edu.abstracts;
//abstract 추상 
public abstract class Animal {
	
	private String name;
	public Animal() {
		System.out.println("Animal() 생성자 호출 ");
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//추상메소드 정의 (실체가없음  //반드시 하위 클래스에서 구현해야함 
	public abstract void eat(); //중괄호해서 구현되는것이 없고 선언되는 것만 있음 
	//상속에서만 쓰임 
	public abstract void speak();
	
	//예외 처리~!~!~~~~~~~~~~~~!!!!!!!!!!!!!!!!!!!

}
