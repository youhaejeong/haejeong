package com.edu.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamExample2 {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("키위새", "남자", 70,100));
		list.add(new Student("유리", "여자", 80,120));
		list.add(new Student("짱구", "남자", 85,95));
		list.add(new Student("슬기", "여자", 88,99));
		
		
		
		list.stream().filter(student -> (student.score + student.point) >=180)//
		.sorted()// Comparable 구현하는 클래스 <---정렬하는 명령어 
		.forEach(student -> System.out.println(student));//<--해당하는 결과에 따라 화면에 출력 
		System.out.println("========================");
		
		//남자,여자 스코어 + 포인트 > 180이상인 학생들만 출력 
		list.stream().filter(student -> (student.score + student.point) >=180).filter(student ->student.gender.equals("여자"))//
		.forEach(student -> System.out.println(student));
		
		System.out.println("========================");
		
		list.stream().filter(student -> (student.score + student.point) >=180).filter(student ->student.gender.equals("남자"))//
		.forEach(student -> System.out.println(student));
		
		
		System.out.println("========================");
		list//컬렉션부터
		.stream() // 스트림생성.
        .filter(student -> student.score >= 80)// 80정 이상인 대상을 필터
		.filter(student -> student.gender.equals("여자"))//
		.forEach(student -> System.out.println(student));// 필터링된대상을출력
		
		System.out.println("========================");
	}
}