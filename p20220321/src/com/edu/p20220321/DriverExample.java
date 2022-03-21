package com.edu.p20220321;

public class DriverExample {
	public static void main(String[] args) {

		Vehicle v1 = new Vehicle();
		v1 = new Taxi();
		v1 = new Bus(); // 버스클래스가 만들어졌을경우 런과 스탑이 실행됨

		Driver driver = new Driver();
		driver.drive(v1); // 매개변수의 다형성

		Vehicle vehicle = new Vehicle();
		Taxi taxi = new Taxi();
		Bus bus = new Bus();

		System.out.println("Vehicle의 최고속력: " + vehicle.getMaxSpeed());
		System.out.println("택시의 최고속력: " + taxi.getMaxSpeed());
		System.out.println("버스의 최고속력: " + bus.getMaxSpeed());
		System.out.println("===============================================");

		Vehicle[] vehicles = new Vehicle[3]; // 이게 정수형 배열
		vehicles[0] = vehicle;
		vehicles[1] = taxi;
		vehicles[2] = bus;
		Vehicle temp = vehicles[0];
		for (int i = 0; i < vehicles.length - 1; i++) {

			for (int j = 0; j < vehicles.length - 1; j++) {
				if (vehicles[j].getMaxSpeed() < vehicles[j + 1].getMaxSpeed()) {
					temp = vehicles[j];
					vehicles[j] = vehicles[j + 1];
					vehicles[j + 1] = temp;
				}

			}

		}
		for (int i = 0; i < vehicles.length; i++) {
			System.out.println("빠른것부터 정렬해서 " + vehicles[i].getMaxSpeed());
		}
		System.out.println("===============================================");
		System.out.println("최고빠른 것은 " + vehicles[0].getMaxSpeed());
		System.out.println("===============================================");
		System.out.println(vehicles[0].toString());
		System.out.println("===============================================");

		// 속도가 제일 빠른 타는것의 정렬해서
	}

}
