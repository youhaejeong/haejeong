package com.edu.collect;

public class StudentExe { //시스템 시작할떄 보이는 첫 화면 같은 부분 
	//첫 구동임 (메인이라서) 그 기능들은 스튜던트 앱에서 함
	public static void main(String[] args) {
		StudentApp app = new StudentApp(); //인스턴스를 생성.
		app.execute();
	}

}
