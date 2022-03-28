package com.edu;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MemberApp {

	List<Member> members = new ArrayList<Member>();
	static Scanner scn = new Scanner(System.in);

	class MemberServiceImpl implements MemberService {

		@Override
		public void addMember(Member member) {
			members.add(member);
		}

		@Override
		public void modifyMember(Member member) {

			for (int i = 0; i < members.size(); i++) {
				if (members.get(i).getMemberId() == member.getMemberId()) {
					members.get(i).setPhone(member.getPhone());
				}
			}

		}

		@Override
		public List<Member> memberList() {
			return members;
		}

	}

	// MemberService 를 구현하는 구현클래스 선언
	public void execute() {
		// 메유: 1.등록 2.수정 3.전체리스트 9.종료
		// 기본정보 아이디 이름 연락처
		// 도서반 =>기본정보 반장이름 강의실정보 ==> 리스트에 추가
		// 수영반 =>기본정보 강사이름 등급
		// 축구반 => 기본정보 강사이름 락커등급
		MemberService service = new MemberServiceImpl();

		while (true) {
			int menu = 0;
			try {
				System.out.println("1.등록 2.수정 3.전체리스트 9.종료");
				System.out.println("선택>>> ");
				menu = scn.nextInt(); //등록

				if (menu == 1) {
						int menu2 = 0;
						System.out.println("1.도서부 2.축구부 3.수영부 4.이전");
						System.out.println("선택>> ");
						menu2 = scn.nextInt();
						if (menu2 == 1) {
							System.out.println("아이디를 입력하세요");
							int memNo = scn.nextInt();
							System.out.println("이름을 입력하세요");
							String memName = scn.next();
							System.out.println("연락처를 입력하세요");
							String memPhone = scn.next();
							System.out.println("반장의 이름을 입력하세요");
							String bookName = scn.next();
							System.out.println("강의실의 이름을 입력하세요");
							String bookRoom = scn.next();
							BookMember m1 = new BookMember(memNo, memName, memPhone, bookName, bookRoom);
							service.addMember(m1);
						} else if (menu2 == 2) {
							System.out.println("아이디를 입력하세요");
							int memNo = scn.nextInt();
							System.out.println("이름을 입력하세요");
							String memName = scn.next();
							System.out.println("연락처를 입력하세요");
							String memPhone = scn.next();
							System.out.println("강사의 이름을 입력하세요");
							String soccerName = scn.next();
							System.out.println("락커를 입력하세요");
							String soccerRoom = scn.next();
							SoccerMember m2 = new SoccerMember(memNo, memName, memPhone, soccerName, soccerRoom);
							service.addMember(m2);
						} else if (menu2 == 3) {
							System.out.println("아이디를 입력하세요");
							int memNo = scn.nextInt();
							System.out.println("이름을 입력하세요");
							String memName = scn.next();
							System.out.println("연락처를 입력하세요");
							String memPhone = scn.next();
							System.out.println("강사의 이름을 입력하세요");
							String swimName = scn.next();
							System.out.println("등급을 입력하세요");
							String swimRank = scn.next();
							SwimMember m3 = new SwimMember(memNo, memName, memPhone, swimName, swimRank);
							service.addMember(m3);
						}
					
				} else if (menu == 2) {
					System.out.println("수정할 회원의 번호를 입력하세요 ");
					int memNo = scn.nextInt();
					System.out.println("전화번호를 입력하세요 ");
					String num = scn.next();
					Member member = new Member(memNo,null,num);
					service.modifyMember(member);
					
				} else if (menu == 3) {
					List<Member> member = service.memberList();
					for (Member s : member) {
						System.out.println(s.toString());
					}

				} else if (menu == 9) {
					System.out.println("프로그램을 종료합니다. \n");
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("숫자를 입력하세요");
				scn.next();
			}
		} // end of while
		System.out.println("end of prog");
	}
}
