package com.edu;

public class Variables {
	public static void main(String[] args) {
		// 변수 : 메모리공간 이름지정 값을 할당.
		int age = 20; // 정수라는 값을 왼쪽 변수에 할당하겠습니다 // 20 == 30 //오른쪽에 있는 값을 왼쪽에 할당 //변수를 초기화
		int num1 = 50;
		int num2 = 50;
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " =" + result);
		System.out.println("age변수:" + age);
		System.out.println("20 + 10 = 30");

		String name = "홍길동"; // 문자열. //첫 변수는 초기화같은 느낌 
		name = "최민규";
		System.out.println(name + "의 나이는 " + age +"입니다.");//문자열 다음에 +는 나열 함 
		//처음할때는 String이라는 것이 있어야함 두번째 입력시에는 변수만 입력하면됨 
		
		final String myName = "유해정"; //final 상수(Constance) - 고정된값 
//		myName ="이해정";
		
		//전화번호, 이메일 값을 담을수 있는 변수. 
		//code
		
		String phoneNember = "010-4516-1747"; //스트링은 문자열 인트는 정수 
		String email ="dbgowjd98@gmail.com";
		final String Num= "010-4516-1747";
		System.out.println(myName +"의 전화번호는:" + phoneNember +"이고 이메일은" + email + "입니다.");//""는 내가 쓰고싶은말 나오게 하는 것 
	
		System.out.println("유해정의 전화번호: 010-4516-1747이고 이메일은 dbgowjd98@naver.com입니다");
	}

}
