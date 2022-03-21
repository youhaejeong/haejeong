package com.edu.abstracts;

public class AnimalExample {
	public static void main(String[] args) {
//	Animal animal =new Animal();  //추상클래스의 경우 인스턴스가 생성불가인 큰 규칙이 있다	
		Animal animal = null;
		animal = new Dog(); // Dog는 실체가 있는 클레스로 작동
		animal.setName("초코");
		animal.eat();
		animal.speak();
		
		animal = new Cat();
		animal.setName("두부");                                                                                                                            
		animal.eat();
		animal.speak();

	}

}
