package com.edu.interfaces;
//인터페이스 다중상속이 가능함  
//인터페이스 ==>
// 규칙을 정하기 위해 사용
// 추상메소드를 사용하고 반드시 구현해야함 

public interface Dao extends RemoteControl,Run{
	//추상메소드
	public void select(); //조회
	public void insert(); //입력
	public void update(); //수정
	public void delete(); //삭제 

}
