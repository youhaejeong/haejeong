package com.prod;

public class ArrayExample {
	public static void main(String[] args) {
	//	long L1 = 123456789123456789L //(L을 안붙이면 에러가남
		int i1 =100;   //4byte 이때 차이는 데이터를 담을수 있는 크기 차이 
		byte b1 =127;  //1byte -128 ~ -1/0 ~127
		 b1++; //128
		 b1++;  //127
		 System.out.println(b1);
		 short s1 = 100; //2바이트 짜리 -32768~-1/ 0 ~32767
		 System.out.println(Long.MAX_VALUE);
		 System.out.println(Integer.MAX_VALUE);
		
		 
		 
	}

}
