package com.edu.api;

import java.util.ArrayList;

public class WrapperEzample {
	public static void main(String[] args) {
		//기본타임(int, long, double, boolean..)
		//참조타입(Integer, Long Double Boolean...)
		//<> 는 제너릭? 타입 무조건 클래스타입만 와야함 
		// int-> Integer (boxing) // Integer -> int (unboxing) 
		ArrayList<Integer> ary = new ArrayList<Integer>();
		ary.add(100);
		ary.add(new Integer(200)); //이때 중간 줄은 Deprecated. 향후 자바에서 제거할 예정 현재는 괜찮지만 나중에 오류나니 이렇게 쓰지 마렛요 
		
		new Integer(100).floatValue(); //100.0
	}

}
