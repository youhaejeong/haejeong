package com.edu.thread;

import java.awt.Toolkit;

class BeepTask implements Runnable {

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

//process(main thread 
public class BeepPrintExample {
	public static void main(String[] args) {
		// 스레드를 생성하는 법
		// Thread의 생성자의 매개값으로 Runnable을 구현한 객체
//		Thread thread = new Thread(new BeepTask()); //이렇게 해도되고
		//Runnable 인터페이스의 익명구현객체를 생성
		//Thread 클래스의 생성자 매개값으로 활용 
		Thread thread = new Thread(() ->
//				new Runnable() {
		// 람다식으로 사능

//			@Override
//			public void run() ->
		{
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for (int i = 0; i < 5; i++) {
				toolkit.beep();
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

//			}

		});
		thread.start(); // 스레드 시작

		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

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
