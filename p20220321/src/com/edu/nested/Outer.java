package com.edu.nested;

public class Outer {
	// 필드
	private String field1;
	private int field2;

	class Inner { // 멤버클래스.(클래스안의 클래스)
		String field3;
		int field4;

		void method2() {
			System.out.println("Inner.method2()");
		}
	} // end of 멤버클래스

	//함수적 인터페이스 : 구현해야할 메소드가 하나인것 
	interface Runnable {
		void run();
	}

	class Bus implements Runnable {

		@Override
		public void run() {
			System.out.println("Bus가 달립니다..");
		}

	}

	public String getField1() {
		return field1;
	}// end of getField1

	public void method1() {
		System.out.println("Outer.method1()");
		Inner inner = new Inner();
		inner.method2();

	}// end of method1

	public void method3() {
		System.out.println("Outer.method3()");

		class Local { // 로컬클래스 (메소드안의 클래스 )

			void method4() {
				System.out.println("Outer.method4()");
			}// end of Local method4
		}// end of Local class
		Local local = new Local();
		local.method4();
	}// end of method3

	public void method4() {
		Runnable runnable = new Bus(); // 인터페이스의 구현객체 가능
		runnable.run();

		// 익명구현객체. 메소드안에서만 가능 
		//() -> ====>Lamb0da 표현식
		runnable = () ->System.out.println("임의의 객체를 실행합니다."); //인터페이스 안에 메소드가 하나일때만 가능 //function(함수)
		//runnable = new Runnable() {

//			@Override
//			public void run() {
//				System.out.println("임의의 객체를 실행합니다.");
//
//			} // 한번선언하고 버림
//
//		};
		runnable.run();

	}

}// end of Outer
