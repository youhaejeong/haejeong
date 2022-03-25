package com.edu;

public class BookMember extends Member{
	
	String bookName;
	String className;
	
	
	
	
	
	
	
	public BookMember(int memberId,String memberName,String phone,String bookName, String className) {
		super(memberId,memberName,phone);
		this.bookName = bookName;
		this.className = className;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	@Override
	public String toString() {
		return "BookMember [아이디: "+super.getMemberId()+"이름: "+super.getMemberName()+"연락처: "+super.getPhone()+"반장: " + bookName + "강의실: " + className + "]";
	}
	
	
	
	// 도서반의 반장이름.
	// 도서반의 강의실정보.(지혜실, 지식실, 모험실)
	
	// 정보출력시 => 반장이름: 홍길동, 강의실: 모험실 
}
