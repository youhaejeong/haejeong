package com.edu.collect;

public class Student { //메인메소드 없음!
	//학생번호(1,2,3..),이름(홍길동...),영어점수(70,80...),국어점수(75,80...)
	private int stuNo;
	private String stuName;
	private int engScore;
	private int korScore;
	
	
	
	
	public Student() {
	}
	
	public Student(int stuNo, String stuName, int engScore, int korScore) {
		this.stuNo = stuNo;
		this.stuName = stuName;
		this.engScore = engScore;
		this.korScore = korScore;
	}
	public int getStuNo() {
		return stuNo;
	}
	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
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
	//toString() => 재정의 오버라이팅

	@Override
	public String toString() {
		return "학생정보[ 학생번호:" + stuNo + " 학생의이름:" + stuName + " 영어점수:" + engScore + " 국어점수:" + korScore
				+" ]";
	}
	
	
	

	//생성자 : 기본생성자, 매개값이 4개 생성자
}
