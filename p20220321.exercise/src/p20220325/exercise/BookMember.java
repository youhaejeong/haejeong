package p20220325.exercise;

public class BookMember extends Member {

	private String bookName;
	private String className;

	public BookMember(int memberId, String memberName, String phone, String bookName, String className) {
		super(memberId, memberName, phone);
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
		String info = super.toString(); //부모클래스(멤버) id,name,phone
		info +="\n추가정보) 반장이름:"+bookName+ ", 강의실: "+className +"\n";
		return info;
	}

	// 도서반의 반장이름.
	// 도서반의 강의실정보.(지혜실, 지식실, 모험실)

	// 정보출력시 => 반장이름: 홍길동, 강의실: 모험실
}
