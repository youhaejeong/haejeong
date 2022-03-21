package com.edu.except;

public class SlowEx {
	public static void main(String[] args) {
		//charAt문자를 한개씩 가져옴 
		showInterval("HELLO,WORLD \n I'm fine Thank you and you");
	}
	public static void showInterval(String str) {
		for (int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i));
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
