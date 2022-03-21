package com.edu.p20220321;

public class Taxi extends Vehicle {

	public Taxi() {
		super.setMaxSpeed(120);
	}

	@Override
	public void run() {
		System.out.println("Taxi 가 달립니다.");
	}

	@Override
	public void stop() {
		System.out.println("Taxi 가 멈춥니다.");
	}

	@Override
	public String toString() {
		String str = "택시의 최고속도는 " + getMaxSpeed() + "입니다";
		return str;
	}
}
