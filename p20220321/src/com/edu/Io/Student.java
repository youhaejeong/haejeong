package com.edu.Io;

import java.io.Serializable;

public class Student implements Serializable {
	// 학생번호(1,2,3), 이름(홍길동), 영어(80), 국어(70).
	private int studentNo;
	private String name;
	private int engScore;
	private int korScore;

	// 생성자: 기본생성자, 매개값이 4개 생성자.
	public Student() {

	}

	public Student(int studentNo, String name, int engScore, int korScore) {
		super();
		this.studentNo = studentNo;
		this.name = name;
		this.engScore = engScore;
		this.korScore = korScore;
	}

	// Getter, Setter 생성.
	public int getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEngScore() {
		return engScore;
	}

	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}

	public int getKorScore() {
		return korScore;
	}

	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}
	// toString() => 재정의.

	@Override
	public String toString() {
		return "학생정보[ 학생번호: " + studentNo + ", 이름: " + name + ", 영어: " + engScore + ", 국어: " + korScore + "]";
	}

}
