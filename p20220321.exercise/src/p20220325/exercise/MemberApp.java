package p20220325.exercise;
//3월 25일 시험 관련 

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

		while (true) {
			System.out.println("1.등록 2.수정 3.전체리스트 9.종료");
			System.out.println("선택>>> ");

			int menu = scn.nextInt(); // 등록

			if (menu == 1) {
				System.out.println("1.도서회원 2.축구회원 3.수영회원");
				int menu2 = scn.nextInt();

				// 공통질문이기떄문에 이프문 위에 입력하여 반복할수있게함
				System.out.println("회원아이디를 입력하세요");
				int memberId = scn.nextInt();
				System.out.println("회원의 이름>>> ");
				String memName = scn.next();
				System.out.println("연락처>>> ");
				String phone = scn.next();
				if (menu2 == 1) {
					System.out.println("반장이름>>> ");
					String bookName = scn.next();
					System.out.println("강의실>>> ");
					String className = scn.next();

					members.add(new BookMember(memberId, memName, phone, bookName, className));

				} else if (menu == 2) {

				} else if (menu == 3) {

				} else {

				}

			} else if (menu == 2) {

			} else if (menu == 3) {

			} else if (menu == 9) {
				System.out.println("프로그램을 종료합니다. \n");
				break;
			} else {
				System.out.println("숫자를 입력하세요");
			}
		} // end of while
		System.out.println("end of prog");
	}

}
