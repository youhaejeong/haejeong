package com.edu.collect;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		// Map : {key:value} 두개가 같이 묶여서 저장됨
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("키위새", 80);
		map.put("미니언", 82);
		map.put("제로", 85);
		map.put("제로", 88); // 키값이 중복 될경우 새로운 값으로 덮어씌움
		// 컬렉션 : 여러값을 저장. => 여러요소 접근

		Integer val = map.get("제로");
		System.out.println(val);
		System.out.println("==============================");

		Set<String> keySet = map.keySet(); // map컬렉션에 저장된 요소들의 키에 해당 값을 Set컬렉션에 담아줌
		// 1)
		Iterator<String> iter = keySet.iterator();

		while (iter.hasNext()) {
			String key = iter.next();
			Integer value = map.get(key);
			System.out.printf("key:%5s value:%5d \n", key, value);
		}
		System.out.println("=====================");
		// 2) for( : ) 확장 for
		for (String key : keySet) { // 키셋에 있는 만큼만 돌려드림
			Integer value = map.get(key);
			System.out.printf("key:%5s value:%5d \n", key, value);
		}

		System.out.println("==end of prog==");
	}

}
