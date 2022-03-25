package com.edu.thread;

import java.awt.Toolkit;

class BeepThread extends Thread {

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

public class BeepPrintExample2 {
	public static void main(String[] args) {
//비프음 생성
		//Thread클래스를 상속받는 클래스를 선언
		//run메소드를 override기능 구현 
		//멀티Thread를 구현하는거 목표였음 
		//자식 클래스에서 스타트 
		Thread thread = new BeepThread();
		thread.start();

		// 그냥 비프 문자 출력
		for (int i = 0; i < 5; i++) {
			System.out.println("beep");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("end of prog");
	}

}
