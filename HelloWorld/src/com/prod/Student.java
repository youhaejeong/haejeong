package com.prod;

public class Student { //이런것들이 참조용
	//학번의 유형 22-123456
	//필드. field
	String studentNo;
	String studentName;
	int korScore;
	int engScore;
	
	//필요한 항목들을 정해서 쓰면 됨 
	
//	method 기능 ..함수
	void study() {
	
		System.out.println("공부를 합시다");
	}
	void study(String gwamok) {//void 는 값을 반환하지 않아서 return을 쓰지 않음 쓰더라도 에러남
		System.out.println(gwamok + "를(을) 공부합시다");
		System.out.println("공부를 합시다");
	}
	void eat(String food) { //eat 안에 있는것이 매개 변수 
		System.out.println(food +"을 먹습니다.");
	}
	
	
	int getkorScore() {// 값을 반환할수있따 
		return korScore;// 지정한것을 돌려드림 
	}
	
	int getengScore() {//정의해야지 사용가능
		return engScore;
		
	}
	
	

}
