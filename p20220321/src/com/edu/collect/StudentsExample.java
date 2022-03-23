package com.edu.collect;

import java.util.ArrayList;
//연습
public class StudentsExample {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>() ;
		
		Student s1 =new Student(101,"키위새",70,73);
		Student s2 =new Student(102,"미니언",80,85);
		Student s3 =new Student(103,"탄지로",84,88);
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		Student result =list.get(0); //첫번쨰 학생정보 저장/
		System.out.println("첫번째 학생: "+result.toString());
		System.out.println("=============================");
		
		list.set(0, new Student(201,"네즈코",90,92)); //첫번째 학생정보 수정 //첫번째 인스턴스 변경
		result =list.get(0);
		System.out.println("첫번째 학생: "+result.toString());
		System.out.println("=============================");
		
		list.get(0).setKorScore(100); //첫번째 인스턴스의 값을 변경
		list.get(0).setEngScore(100); //첫번째 인스턴스의 값을 변경
		System.out.println("첫번째 학생: "+result.toString());
		System.out.println("=============================");
		
		list.remove(0); //삭제처리
		System.out.println("첫번째 학생: "+list.get(0).toString()); //삭제처리후 값을 비우는 것이 아니라 당겨씀 
		System.out.println("=============================");
	}

}
