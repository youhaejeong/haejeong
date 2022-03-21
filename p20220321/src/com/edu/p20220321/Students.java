package com.edu.p20220321;

//extends는 다른 클레스에 잇는 것을 그대로 가져와 쓰겟다 
public class Students extends Person {
	//학생의 경우 : 학교, 학년 : 공통으로 이름 나이 키 몸무게 
	private String school;
	private int grade;
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	

}
