package com.prod;

public class User {
	private int userId;
	private String userRank;
	private String  userPhone;
	private int userPoint;
	
	public void setuserId(int userId) {
		this.userId = userId ;
	}
	public int getuserId() {
		return userId;
	}
	public void setuserRank(String userRank) {
		this.userRank =userRank;
	}
	public String getuserRank() {
		return userRank;
	}
	public void setuserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getuserPhone() {
		return userPhone;
	}
	public void setuserPoint(int userPoint) {
		this.userPoint = userPoint;
	}
	public int getuserPoint() {
		return userPoint;
	}
	
	public String getuserInfo ( ) {
		String result = this.userId + "의 연락처는 " +//
	                    this.userPhone + " 이고 랭크는 " +//
				        this.userRank +" 이고 포인트는 "+//
	                    this.userPoint + "입니다.";
	          return result;          
	}

} 
