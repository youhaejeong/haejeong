package com.prod;
//클래스 멤버와 스튜던트에 연관 
public class MemberExample {
	public static void main(String[] args) {
		// 정수를 쓸떄 int 사용 하여 int num1=10;
		// 문자르 담고싶을때 String 사용 String = "홍길동";
		// ?? member ="홍길동",10;
	
		//한클래스안에는 못만드나?
		//밑의것을 쓸때 반드시 new ??() 해줘야함
		Member mem1 =new Member(); //name, age 속성이 아직 없음 --초기화
		
		//mem1.name = "홍길동";
		//mem1.age = 20;
		
		Member mem2 =new Member(); //mem2 의 속성은 ~~
		mem2.name = "김민수";
		mem2.age = 25;
		
		
		System.out.println("mem1의 name속성: "+ mem1.name);
		System.out.println("mem1의 age속성: " + mem1.age);
		
		
		
		Student st1 = new Student(); //초기화
		st1.studentNo = "22-1234987";
		st1.studentName = "홍좌";
		st1.korScore = 90;
		st1.engScore = 80;

		
		
	}

}
