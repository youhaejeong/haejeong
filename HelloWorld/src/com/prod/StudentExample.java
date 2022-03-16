package com.prod;

public class StudentExample {
	public static void main(String[] args) {
		Student s1= new Student();//반드시 초기화를 해줘야함 
		s1.studentName = "홍길동";
		s1.korScore = 80;
		s1.engScore = 70;
		
		s1.study();
		s1.eat("간식"); //참조가 되는 클래스가 저장이 되어있어야 오류가 안남 //매개변수를 사용할떄는 괄호안에 관련 내용써야함
		s1.eat("급식");
		s1.eat("사탕");
		

		int v1 =s1.getkorScore();
		int v2 =s1.getengScore();
		System.out.println(v1);
		
		System.out.println("국어점수" + v1 +", 영어점수: " + v2);
		
	}

}
