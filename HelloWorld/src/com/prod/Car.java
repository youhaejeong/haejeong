package com.prod;
// 빈공간 우클릭 소스 선택 겟 셋 셋팅
public class Car {
//	모델, 현재 속도, 최고속도, 가속(메소드) ,감속(메소드), 현재속도(메소드)
	private String model;
	private int speed;
	private int maxSpeed;
	
	
	
public void setModel(String model) {
		this.model = model;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	//	가속 메소드
	public void addSpeed() {
		if (this.speed +10>= this.maxSpeed) {
			System.out.println("최고속도를 초과할수없습니다.");
			return;
		}
		System.out.println("10km 가속합니다.");
		this.speed += 10;
		
	}//0키로보다 안떨어지게 코드 넣어보기
	public void breakSpeed() {
		System.out.println("10km 감속합니다.");
		this.speed -= 10;
	}
	public int getSpeed() {
		return this.speed;
	}
	

}
