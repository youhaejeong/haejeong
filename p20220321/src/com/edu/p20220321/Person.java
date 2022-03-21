package com.edu.p20220321;
//새로운 데이터 타입
//모든 클래스가 상속받는 최상의 클래스는 extends Object
public class Person extends Object {
	//공통되는 정보를 필드에 입력 
	
	//필드 
	private String name;
	private int age;
	private double height;
	private double weight;
	
	
	
	//생성자
	//overloading.(중복선언)
	//밑에 퍼블릭 펄슨 클래스를 선언 안하면 자식클래스에 상속해줄수 없으 ㅁ
	public Person() {
		
	}// 기본생성자
	public Person(String name) {
		this.name =name;
	}
	

	public Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	
	//method
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getAge() {
		return age;
	}
	public double getHeight() {
		return height;
	}
	public double getWeight() {
		return weight;
	}
	

}
