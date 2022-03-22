package com.edu.interfaces;

public class Radio implements RemoteControl{
	public void turnOn() {
		System.out.println("라디오를 켭니다");
		
	}
	public void turnOff() {
		System.out.println("라디오를 끕니다");
	}
	@Override
	public void powerOn() {
		System.out.println("라디오를 켭니다");
		
	}
	@Override
	public void powerOff() {
		System.out.println("라디오를 끕니다");
		
	}

}
