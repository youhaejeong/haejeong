package com.edu.api;

public class ApiExample {
	public static void main(String[] args) {
		IDCheck idcheck = new IDCheck();
		String result = idcheck.getGender("950304-1234567");
		System.out.println(result);
		result = idcheck.getGender("9503042234567");
		System.out.println(result);
		result = idcheck.getGender("950304 1234567");
		System.out.println(result);
		System.out.println("====end of prog=========");

	}

}
