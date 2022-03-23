package com.edu.collect;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//set collect 집합?
public class SetExample {
	public static void main(String[] args) {
		// Set:중복값은 허용하지 않습니다.

		Set<String> set = new HashSet<String>();
		set.add("즐거운 자바");
		set.add("귀여운 키위새");
		set.add("cute");
		set.add("가희는 귀여워");//중복된 요소는 추가 불가 
		
		set.remove("cute");
		
		System.out.println("set의 크기: " + set.size());
		System.out.println("==============================");
		//반복자를 생성하는 메소드 .iterator()
		Iterator<String> iter = set.iterator(); //반복자 (반복되는 요소를 하나씩 끄집어내는 역할)
		while(iter.hasNext()) { //가져올게있는지 확인 
			String result = iter.next(); //.next()는 하나만 가져옴 
			System.out.println(result);
		}
		System.out.println("==end of prog==");
	}

}
