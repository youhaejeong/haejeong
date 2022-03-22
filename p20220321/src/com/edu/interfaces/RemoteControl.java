package com.edu.interfaces;

public interface RemoteControl {
	//필드생성불가
	//private String macVolume; 
	
	public static final int Max_Volume = 10; //상수로 선언 
	public static final int Min_Volume = 0; //상수로 선언
	//상수가 모얌!!!
	//final 마지막값으로 안바뀌게 하겠슴둥
	//생성자 불가 
	//추상메소드. 구현하는 기능이 없음
	public void powerOn(); 
	public void powerOff();

}
