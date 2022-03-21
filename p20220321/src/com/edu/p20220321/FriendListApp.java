package com.edu.p20220321;

public class FriendListApp {
	public static void main(String[] args) {
		Friend[] friends = new Friend[10]; // 프렌즈라는 프렌드의 배열 선언
		//인스턴스 == 정보만 담고있는것을 실체화 하겠습니다.

		Friend f1 = new Friend();
		f1.setName("보라돌이");
		f1.setAge(25);
		f1.setHeight(178.3);
		f1.setWeight(68.9);
		f1.setPhone("010-2323-9845");

		UnivFriend f2 = new UnivFriend("뜌비", 29, 178.3, 69.2, "010-1212-1212");
		f2.setUniversity("대구대학교");
		f2.setMajor("컴퓨터공학과");

		ComFriend f3 = new ComFriend("나나", 29, 179.3, 75.2, "010-4561-1111", //
				"네이버", "지도app개발연구원");
		
		Friend f4 = new Friend();
		f4.setName("뽀");
		f4.setAge(25);
		f4.setHeight(178.3);
		f4.setWeight(68.9);
		f4.setPhone("010-2323-9845");

		UnivFriend f5 = new UnivFriend("케로로", 29, 178.3, 69.2, "010-1212-1212");
		f5.setUniversity("대구대학교");
		f5.setMajor("컴퓨터공학과");

		ComFriend f6 = new ComFriend("기로로", 29, 179.3, 75.2, "010-4561-1111", //
				"네이버", "지도app개발연구원");

		friends[0] = f1;
		friends[1] = f2;
		friends[2] = f3;
		friends[3] = f4;
		friends[4] = f5;
		friends[5] = f6;
		
		//학교친구만 출력 
		for (int cnt = 0; cnt<friends.length; cnt++) {
			if(friends[cnt] != null && friends[cnt] instanceof UnivFriend) {
				//동일한 기능이지만 인스턴스 종류에 다른 결과 실행 => 다형성.
				System.out.println(friends[cnt].toString());
		
			}
		}

		for (int i = 0; i < friends.length; i++) {
			if (friends[i] !=null)
			System.out.println(friends[i].toString());

		}
		Friend friend =f2; //UnivFriend;의 인스턴스friend.get 했을때 getUniversity,getMajor 가 안따라옴 부모클래스에 있는 것만 사용할수있음
		Friend friend2 =(Friend) f2;
		
		friend = f1;
		UnivFriend uni = (UnivFriend) friend; //강제형 변환 
		uni.getUniversity(); // 부모클래스의 참조 변수 => 자식클래스이 참조변수 할당 
		
		UnivFriend uni2 = null;
		friend = f1; //프렌드 클래스의 인스턴스를 자식 클래스의 유니브로바꿔주겠다 강제형 변환을 할때 바로위것처럼 하면 오류남 이때 에러는 안나나 실행하면 에러남 
		if(friend instanceof UnivFriend) //friend변수값이 UnivFriend의 인스턴스인지 확인 만약에 유니브 클래스에 있는 것이면 실행하고 아니면 안함 
			uni2 =(UnivFriend) friend; //casting 해야함 
			uni2.getUniversity();// 부모클래스의 참조 변수 => 자식클래스이 참조변수 할당 
		

	}

}
