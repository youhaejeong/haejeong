package com.edu;

public class SoccerMember extends Member{
	String soccerName;
	String soccerRoom;
	
	
	
	
	
	
	public SoccerMember(int memberId,String memberName,String phone,String soccerName, String soccerRoom) {
		super(memberId,memberName,phone);
		this.soccerName = soccerName;
		this.soccerRoom = soccerRoom;
	}
	public String getSoccerName() {
		return soccerName;
	}
	public void setSoccerName(String soccerName) {
		this.soccerName = soccerName;
	}
	public String getSoccerRoom() {
		return soccerRoom;
	}
	public void setSoccerRoom(String soccerRoom) {
		this.soccerRoom = soccerRoom;
	}
	@Override
	public String toString() {
		return "SoccerMember [아이디: "+super.getMemberId()+"이름: "+super.getMemberName()+"연락처: "+super.getPhone()+"축구강사: " + soccerName + "락커: " + soccerRoom + "]";
	}
	
	
	
	
	
	// 축구반의 코치이름.
	// 락커룸의 이름.(A, B, C, D)
	
	// 정보출력시 => 코치이름: 홍길동, 락커룸: A 
}
