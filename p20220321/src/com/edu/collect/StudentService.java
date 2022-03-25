package com.edu.collect;

import java.util.List;

public interface StudentService {
	//추상메소드
	//기능하기위해서 다른클래스에서 구현해줘야함 
	public void insertStudent(Student student); //입력
	public Student getStudent(int sno); //한건 조회
	public List<Student> studentList(); //전체 목록
	public void modifyStudent(Student student); //한건 수정
	public void deleteStudent(int sno); //한건삭제
	public List<Student> searchStudent(String name);
	//searchStudent 는 집가서 동명이인이 있을수있기때문에 여러건을 반환하겠슴다
	public void saveToFile();

}
