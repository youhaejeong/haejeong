package com.edu.api;

import java.util.ArrayList;
import java.util.HashSet;

public class MemberExample {
	public static void main(String[] args) {

		Member m1 = new Member("User1", "홍길동");
		Member m2 = new Member("User2", "홍길순");
		if (m1 == m2) { //이렇게 하면 주소 값이 다르기 떄문에 동등하지 않음 
//		if(m1.equals(m2)) {
			System.out.println("논리적으로 동등합니다");
		} else {
			System.out.println("논리적으로 동등하지 않습니다");
		}
		
		//여러가지 데이터를 저장하는 배열 
		//배열의 경우
		Member [] memberAry = new Member[5];//Member의 인스턴스 최대 5개 저장
		                                    //크기를 초과하면 새로운 배열 선언, 복사 
		//->컬렉션 (ArrayList,HashSet,HashMap) : 여러개의 값을 저장 
		ArrayList<Member> memList = new ArrayList<Member>();
		memList.add(new Member("user1","홍길동"));
		memList.add(new Member("user1","홍길동"));
		for(int i=0; i<memList.size(); i++) {
			System.out.println(memList.get(i));
		}
		HashSet<Member> memSet = new HashSet<Member>();
		memSet.add(new Member("user1","홍길동")); //같은 객체인지 구분하는 것을 hashCode(),equals() 가 관여
		memSet.add(new Member("user1","홍길동"));
		
		System.out.println(memSet.size());
		
		
//		Member obj1 = new Member("blue","하나");
//		Member obj2 = new Member("blue","둘");
//		Member obj3 = new Member("red","하나");
//		
//		
//		if(obj1.equals(obj2)) {
//			System.out.println("obj1과 obj2는 동등합니다");
//		}else {
//			System.out.println("obj1과 obj2는 동등하지 않습니다.");
//		}
//		if(obj1.equals(obj3)) {
//			System.out.println("obj1과 obj3는 동등합니다");
//		}else {
//			System.out.println("obj1과 obj3는 동등하지 않습니다.");
//		}
	}

}