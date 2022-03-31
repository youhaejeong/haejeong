package com.edu.board;

public class Board {
	private int userNo;
	private int userPwd;
	private String userName;
	private int boardNo;
	private String boardwrite;

	public Board() {

	}

	public Board(int userNo, int userPwd, String userName, int boardNo, String boardwrite) {
		this.userNo = userNo;
		this.userPwd = userPwd;
		this.userName = userName;
		this.boardNo = boardNo;
		this.boardwrite = boardwrite;
	}

	public Board(int boNum, String boWrite) {
		this.boardNo = boNum;
		this.boardwrite = boWrite;
	}

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public int getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(int userPwd) {
		this.userPwd = userPwd;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public String getBoardwrite() {
		return boardwrite;
	}

	public void setBoardwrite(String boardwrite) {
		this.boardwrite = boardwrite;
	}

	@Override
//	public String bookInfo() {
//		String str = "=========================================\n";
//		str +="책제목: " + this.title +"\n";
//		str +="저자: " + this.author + "\n";
//		str +="출판사: " + this.make +"\n";
//		str +="가격: "+ this.price +"\n";
//		str +="=========================================";
//		return str;
//	}
	public String toString() {
		String str = " ===================게시글======================\n";
		str += "게시번호" + this.boardNo + "\r";
		str += "작성자>" + this.userName + "\n";
		str += "게시내용>>>> \n";
		str += this.boardwrite;
		return str;

	}

}
