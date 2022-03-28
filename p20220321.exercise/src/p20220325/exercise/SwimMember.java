package p20220325.exercise;

public class SwimMember extends Member {

	// 강습반의 강사이름.
	// 수영등급(A,B,C,D)
	// 정보출력시 => 강사이름: 홍길동, 등급: A
	private String teachName;
	private String grade;

	public SwimMember(int memberId, String memberName, String phone, String teachName, String grade) {
		super(memberId, memberName, phone);
		this.teachName = teachName;
		this.grade = grade;
	}

	public String getTeachName() {
		return teachName;
	}

	public void setTeachName(String teachName) {
		this.teachName = teachName;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		String info = super.toString();
		info +="\n 추가정보 강사이름: "+teachName+", 수영등급"+grade+"\n";
		return info;
	}

}
