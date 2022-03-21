package com.edu.p20220321;

public class Bus extends Vehicle {
	public Bus() {
		super.setMaxSpeed(110);
	}

	@Override
	public void run() {
		System.out.println("Bus 가 달립니다.");
	}

	@Override
	public void stop() {
		System.out.println("Bus 가 멈춥니다.");
	}

	@Override
	public String toString() {
		String str = "버스의 최고속도는 " + getMaxSpeed() + "입니다";
		return str;

	}
}
