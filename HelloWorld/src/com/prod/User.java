package com.prod;

public class User {
	int userId;
	String userRank;
	String  userPhone;
	int userPoint;
	
	public void setuserId(int userId) {
		this.userId = userId ;
	}
	public int getuserId() {
		return this.userId;
	}
	public void setuserRank(String userRank) {
		this.userRank =userRank;
	}
	public String getuserRank() {
		return this.userRank;
	}
	public void setuserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getuserPhone() {
		return this.userPhone;
	}
	public void setuserPoint(int userPoint) {
		this.userPoint = userPoint;
	}
	public int getuserPoint() {
		return this.userPoint;
	}
	
	public String getuserInfo ( ) {
		String result = this.userId + "의 연락처는 " +//
	                    this.userPhone + " 이고 랭크는 " +//
				        this.userRank +" 이고 포인트는 "+//
	                    this.userPoint + "입니다.";
	          return result;          
	}

} 
