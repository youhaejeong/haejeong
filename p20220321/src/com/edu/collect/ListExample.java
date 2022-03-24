package com.edu.collect;

import java.util.ArrayList;

public class ListExample {
	public static void main(String[] args) {
		String[] strings = new String[10];
		for (int i = 0; i < strings.length; i++) {
			if (strings[i] == null) {
				strings[i] = "즐거운 자바";
				break;
			}
		}

		ArrayList<String> strAry = new ArrayList<String>();
		strAry.add("즐거운자바");
		strAry.add("원숭이도 할수있는 자바");
		strAry.set(1, "너무 어색한 자바"); //인덱스 1의 위치값을 "너무어색한자바"로 수정 
		strAry.get(0);		
//		strAry.remove(0); //0번째 인덱스값을 삭제하겠습니다. 
		strAry.remove("원숭이도 할수있는 자바"); //안에 값을 지정할수도있음 이때 지울려는 값이 없으면 안지워짐~
		strAry.clear(); //안나오게 만듦~
		System.out.println("strAry.size() =>"+strAry.size());
		System.out.println("=================================");
		for (int i = 0; i < strAry.size(); i++) {
			String result = strAry.get(i);
			System.out.println(result);
		}
	
		
		
		
//		ArrayList<Integer> numAry = new ArrayList<Integer>();
//		for (int i = 0; i < numAry.size(); i++) {
//			int result = numAry.get(i);
//			System.out.println(result);

		}

	}
