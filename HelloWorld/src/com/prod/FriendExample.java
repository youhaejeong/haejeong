package com.prod;

public class FriendExample {
	public static void main(String[] args) {
		// 친구의 정보(이름,전화번호,이메일,키,몸무게)
		Friend f1 = new Friend();
		f1.friendName = "권가희";
		f1.friendPhone = "010-1234-1234";
		f1.email = "rkgml@naver,com";
		f1.height = 156.5;
		f1.weight = 50;

		Friend f2 = new Friend();
		f2.friendName = "이유빈";
		f2.friendPhone = "010-4561-4561";
		f2.email = "dbqls@naver,com";
		f2.height = 168.1;
		f2.weight = 48;

		Friend f3 = new Friend();
		f3.friendName = "황좌";
		f3.friendPhone = "010-7894-4561";
		f3.email = "guswn@naver,com";
		f3.height = 176.1;
		f3.weight = 61;

		System.out.println(f1); // 값의 주소값을 보여줌

		Friend[] friends = { f1, f2, f3 };

		for (int i = 0; i < friends.length; i++) {
			if (friends[i].height > 170) {
				System.out.println("이름: " + friends[i].friendName);
				System.out.println("전화번호: " + friends[i].friendPhone);
				System.out.println("키: " + friends[i].height);
				
				System.out.println("=======================");// 데이터 구분용으로 아무 의미 없음
			}

		}

	}
}