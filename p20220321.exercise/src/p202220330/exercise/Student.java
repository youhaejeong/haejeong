package p202220330.exercise;

public class Student {
	// 필드
	private int stuNo;
	private String stuName;
	private int engScore;
	private int korScore;

	// 기본생성자
	public Student() {

	}

	public Student(int stuNo, String stuName, int engScore, int korScore) {
		this.stuNo = stuNo;
		this.stuName = stuName;
		this.engScore = engScore;
		this.korScore = korScore;
	}

	public int getStuNo() {
		return stuNo;
	}

	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public int getEngScore() {
		return engScore;
	}

	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}

	public int getKorScore() {
		return korScore;
	}

	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}

	@Override
	public String toString() {
		return "학생정보 [학생번호: " + stuNo + " 학생이름: " + stuName + " 영어점수: " + engScore + " 국어점수: " + korScore + " ]";
	}
}
