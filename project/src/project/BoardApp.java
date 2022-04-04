package project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardApp {
	List<Board> list = new ArrayList<Board>();
	Scanner scn = new Scanner(System.in);

	public BoardApp() {

	}

	public void execute() {
		BoardService service = new BoardServiceOracle();
		while (true) {
			System.out.println("===너굴맨 게시판 메뉴 ======");
			System.out.println("1.회원가입 2.로그인 ");
			;
			int menu = 0;
			if (menu == 1 ) {
				//회원가입
				
			}
//			if

		}
//		BoardService service = null;
//		service = new BoardServiceOracle();
//
//		User user;
//		while (true) {
//			System.out.println("=========너굴맨 게시판 메뉴========");
//			System.out.println("1.회원 가입   2.로그인");
//
//			int menu = 0;
//			menu = scn.nextInt();
//			if (menu == 1) {
//				System.out.println("회원번호를 입력하세요");
//				// 중복되지않게
//				int memNo = scn.nextInt();// 아이디입력
//				System.out.println("비밀번호를 입력하세요.");
//				int memPwd = scn.nextInt();// 비밀번호입력
//
//			} else if (menu == 2) {
//				// 아이디비번이 일치했을떄
//				System.out.println("===========너굴맨의 메뉴===========");
//				System.out.println("1.목록  2.작성  3.수정  4.삭제 9.종료");
//				int menu2 = 0;
//				menu2 = scn.nextInt();
//				if (menu2 == 1) {
//					List<Board> list = service.BoardList();
//					for (Board s : list) {
//						System.out.println(s.toString());
//					}
//					// 목록
//				} else if (menu2 == 2) {
//					// 작성
//					System.out.println("게시글 번호를 입력하세요");
//					int boNum = scn.nextInt();
//					System.out.println("내용을 입력하세요");
//					String boWrite = scn.nextLine();
//					;
//					System.out.println("너굴맨 저장 완료!");
//				} else if (menu2 == 3) {
//					// 수정
//				} else if (menu2 == 4) {
//					// 삭제
//				} else if (menu2 == 9) {
//					System.out.println("프로그램을 종료합니다.\n");
//					break;
//				}
//			}
//		} // end of while
//		System.out.println("end of program");
	}
}
