package project;

public class User {
	private String userNo;
	private String userPwd;

	public User() {

	}

	public String getUserNo() {
		return userNo;
	}

	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public User(String userNo, String userPwd) {
		super();
		this.userNo = userNo;
		this.userPwd = userPwd;
	}

}
