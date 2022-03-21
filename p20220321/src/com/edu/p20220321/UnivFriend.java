package com.edu.p20220321;

public class UnivFriend extends Friend {
	// 학교친구 학교이름 전공
	private String university;
	private String major;

	public UnivFriend() {
		super(); // 부모클래스Friend(); 호출하겟음
	}

	public UnivFriend(String name, int age, double height, double weight, String phone) {
		super(name, age, height, weight, phone); // 부모클래스 Friend(이름 나이 키 몸무게 연락처)를 호출
	}

	public UnivFriend(String name, int age, double height, double weight, String phone, //
			String university, String major) {
		super(name, age, height, weight, phone);
		this.university = university;
		this.major = major;

	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		String str = "이름은 " + super.getName() + "이고 \n";
		str +="나이는 " + super.getAge() + "이고 \n";
		str +="연락처는 " + super.getPhone() + "입니다. \n";
		str += "==============<추가정보>=====================\n";
		str +="학교는 " + this.getUniversity() + "이고 \n";
		str +="학과는 " + this.getMajor() + "입니다. \n";
		str +="===========================================\n";
		return str;
	}
	
	

}
