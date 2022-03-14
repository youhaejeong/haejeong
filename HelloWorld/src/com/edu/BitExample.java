package com.edu;

public class BitExample {
	public static void main(String[] args) {
		int num = 10;
		int result = num << 3;
		System.out.println(result);

		int val = 100; // 오른쪽에 있는 값을 왼쪽에 넣겠습니다 대입연산자
		val = val + 10;// 오른쪽 부터 확인
		System.out.println(val);
		val += 20; // 대입 연산자
		System.out.println(val);

		val = val - 5; // 125
		val -= 10; // 115
		System.out.println(val);

		val = val * 2; // 230
		val *= 2; // 460
		System.out.println(val);
		String message = "반갑습니다";
				System.out.println(message);
		
		message =message + " 유해정입니다.";
		System.out.println(message);
		
		message += " 좋은 하루 되세요!!";
		System.out.println(message);
		
		int cnt = 0;
		cnt =cnt + 1;//1을 더하겠다
		System.out.println(cnt);
		cnt += 1;//1을 더하겟다
		System.out.println(cnt);
		cnt++;//1증가시키겟다
		System.out.println(cnt);
		cnt--;//1을 빼겠다
		System.out.println(cnt);
		
		
	
		

	}

}
