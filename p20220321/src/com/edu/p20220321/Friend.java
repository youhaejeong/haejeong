package com.edu.p20220321;

public class Friend extends Person {
	// 이름 키 나이 몸무게 :회사친구 -> 회사이름,직무
	// : 학교친구 -> 학교이름, 전공

	private String phone;

	public Friend() {

	}// => 1. 부모 클랫 호출 후 super (); 규칙임 무조건

	public Friend(String name, int age, double height, double weight, String phone) {
		super(name, age, height, weight);// (super) 부모클래스에 있는 것들을 매개 변수로 써줌
		this.phone = phone;

	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	// overriding =부모클래스의 메소드를 자식클래스가 기능을 새롭게 정의
//	@Override  //재정의 하는건데 규칙을 재정의하겠음 
	public void toString(String args) {
//		return super.toString();
	}

	// overriding =부모클래스의 메소드를 자식클래스가 기능을 새롭게 정의
	// + 누적쓰
	@Override // annotation
	public String toString() {
		String str = "친구의 이름은 " + super.getName() + "이고 \n";
		str += "나이는 " + super.getAge() + "이고 \n";
		str += "연락처는 " + this.getPhone() + "입니다. \n";
		return str;
	}

}
