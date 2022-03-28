package p20220325.exercise;

public class SoccerMember extends Member {
	// 축구반의 코치이름.
	// 락커룸의 이름.(A, B, C, D)

	// 정보출력시 => 코치이름: 홍길동, 락커룸: A

	private String coachName;
	private String rockName;

	public SoccerMember(int memberId, String memberName, String phone, String coachName, String rockName) {
		super(memberId, memberName, phone);
		this.coachName = coachName;
		this.rockName = rockName;

	}

	public String getCoachName() {
		return coachName;
	}

	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}

	public String getRockName() {
		return rockName;
	}

	public void setRockName(String rockName) {
		this.rockName = rockName;
	}

	@Override
	public String toString() {
		String info = super.toString();
		info += "\n 추가정보 코치이름: " + coachName + ", 락커룸: " + rockName + "\n";
		return info;
	}

}
