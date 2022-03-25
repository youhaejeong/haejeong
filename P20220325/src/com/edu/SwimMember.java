package com.edu;

public class SwimMember extends Member{
	// 강습반의 강사이름.
	// 수영등급(A,B,C,D)
	String swimName;
	String swimRank;
	
	public SwimMember(int memberId,String memberName,String phone,String swimName, String swimRank) {
		super(memberId,memberName,phone);
		this.swimName = swimName;
		this.swimRank = swimRank;
	}
	
	
	
	public String getSwimName() {
		return swimName;
	}

	public void setSwimName(String swimName) {
		this.swimName = swimName;
	}
	public String getSwimRank() {
		return swimRank;
	}
	public void setSwimRank(String swimRank) {
		this.swimRank = swimRank;
	}



	@Override
	public String toString() {
		return "SwimMember [아이디: "+super.getMemberId()+"이름: "+super.getMemberName()+"연락처: "+super.getPhone()+"강사: " + swimName + "등급: " + swimRank +  "]";
	}
	
	
	// 정보출력시 => 강사이름: 홍길동, 등급: A 
}
