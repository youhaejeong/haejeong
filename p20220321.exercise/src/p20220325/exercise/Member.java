package p20220325.exercise;

public class Member {
	//필드
	private int memberId;
	private String memberName;
	private String phone;
	
	
//생
	public Member(int memberId, String memberName, String phone) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.phone = phone;
	}
//메소드ㅡ
	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "[회원아이디: " + memberId + " 회원이름:" + memberName + " 연락처: " + phone + "]";
	}

}
