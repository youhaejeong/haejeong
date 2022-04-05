package project;

public class User {
	private int userNo;
	private int userPwd;

	public User() {

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

	public User(int userNo, int userPwd) {
		super();
		this.userNo = userNo;
		this.userPwd = userPwd;
	}

}
