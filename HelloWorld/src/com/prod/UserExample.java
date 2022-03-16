package com.prod;

public class UserExample {
	public static void main(String[] args) {
		User u1 = new User() ;
		u1.setuserId(100);
		u1.setuserRank("A");
		u1.setuserPhone("010-1532-4561");
		u1.setuserPoint(1600);
		
		User u2 = new User() ;
		u2.setuserId(101);
		u2.setuserRank("B");
		u2.setuserPhone("010-5413-4813");
		u2.setuserPoint(500);
		
		User u3 = new User() ;
		u3.setuserId(102);
		u3.setuserRank("C");
		u3.setuserPhone("010-1532-1234");
		u3.setuserPoint(200);
		
		User u4 = new User() ;
		u4.setuserId(103);
		u4.setuserRank("A");
		u4.setuserPhone("010-1234-4561");
		u4.setuserPoint(1500);
		
		
		User u5 = new User() ;
		u5.setuserId(104);
		u5.setuserRank("B");
		u5.setuserPhone("010-5647-4185");
		u5.setuserPoint(900);
		
		System.out.println(u1.getuserInfo());
		System.out.println(u2.getuserInfo());
		System.out.println(u3.getuserInfo());
		System.out.println(u4.getuserInfo());
		System.out.println(u5.getuserInfo());
		
		User[] users= {u1,u2,u3,u4,u5} ;
		
		for (int i = 0; i < users.length; i++) {
			if(users[i].userRank == "A" && users[i].userPoint >= 1000 ) {
				System.out.println("랭크가 A면서 1000포인트 이상인 회원 ID는" + users[i].userId);
				
			}
		}
		
	}

}
