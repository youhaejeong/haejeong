package project;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class BoardApp {
	List<Board> list = new ArrayList<Board>();
	Scanner scn = new Scanner(System.in);
	Board b = new Board();

	public BoardApp() {
	}

	public void execute() {
		BoardService service = new BoardServiceOracle();
		int userId = 0;
		String uId = null;
		int userpwd = 0;
		while (true) {
			System.out.println("===너굴맨 게시판 메뉴 ======");
			System.out.println("1.회원가입 2.로그인 3.계정삭제 9.종료");
			System.out.println("메뉴선택>>>>>");
			int menu = 0;
			while (true) {
				try {
					menu = scn.nextInt();
					break;
				} catch (InputMismatchException e) {
					System.out.println("숫자로입력해주세요");
					uId = scn.next();
				}
			}

			if (menu == 1) {
				System.out.println("아이디를 입력하세요");
				System.out.println("입력>>");

//				userId = scn.nextInt();
				while (true) {
					try {
						userId = scn.nextInt();

						break;
					} catch (InputMismatchException e) {
						System.out.println("숫자로입력해주세요");
						uId = scn.next();
					}
				}

				System.out.println("비밀번호를 입력하세요");
				System.out.println("입력>>");
				while (true) {
					try {
						userpwd = scn.nextInt();
						break;
					} catch (InputMismatchException e) {
						System.out.println("숫자로입력해주세요");
						uId = scn.next();
					}
				}
				User user = new User(userId, userpwd);
				user.setUserNo(userId);
				user.setUserPwd(userpwd);
				service.insertlogin(user);
				// 회원가입
			} else if (menu == 2) {
				System.out.println("아이디를 입력하세요");
				while (true) {
					try {
						userId = scn.nextInt();

						break;
					} catch (InputMismatchException e) {
						System.out.println("숫자로입력해주세요");
						uId = scn.next();
					}
				}
				System.out.println("비밀번호를 입력하세요");
				System.out.println("입력>>");
				while (true) {
					try {
						userpwd = scn.nextInt();
						break;
					} catch (InputMismatchException e) {
						System.out.println("숫자로입력해주세요");
						uId = scn.next();
					}
				}
				User login = service.login(userId, userpwd);
				if (login != null) {
					// 계정이 일치할떄 게시판에 접근 가능하게
					System.out.println("너굴맨의 집에 온걸 환영해!");
					while (true) {
						int menu2 = 0;
						System.out.println("=========너굴맨의 게시판 선택=========");
						System.out.println("1.목록  2.작성  3.수정  4.삭제  5.게시글 선택 9.로그아웃");
						System.out.println("선택>>");
//						while (true) {
//							try {
//								writeId = scn.nextInt();
//								break;
//							} catch (InputMismatchException e) {
//								System.out.println("숫자로입력해주세요");
//								uId = scn.next();
//							}
//						}
						while (true) {
							try {
								menu2 = scn.nextInt();
								break;
							} catch (InputMismatchException e) {
								System.out.println("숫자로입력해주세요");
								uId = scn.next();
							}
						}
						scn.nextLine();
						int writeId = 0;
						if (menu2 == 1) {
							List<Board> list = service.BoardList();
							System.out.println(
									"✧･ﾟ: *✧･ﾟ:*✧･ﾟ: *✧･ﾟ:*✧･ﾟ: *✧･ﾟ:*너굴맨 목록*:･ﾟ✧*:･ﾟ✧*:･ﾟ✧*:･ﾟ✧*:･ﾟ✧*:･ﾟ✧\r\n");
							for (Board b : list) {
//								service.readCount(b);
//								System.out.println(b.toString());

								System.out.println(b.binfo());

							}
							// 목록
						} else if (menu2 == 2) {
							// 작성
							System.out.println("제목을입력하세요");
							String boardName = scn.nextLine();
							System.out.println("내용을 입력하세요");
							String boardWrite = scn.nextLine();
							System.out.println("닉네임을 입력하세요");
							while (true) {
								try {
									writeId = scn.nextInt();
									break;
								} catch (InputMismatchException e) {
									System.out.println("숫자로입력해주세요");
									uId = scn.next();
								}
							}

							Board board = new Board(boardWrite, boardName, writeId);
							service.insertBoard(board);
							System.out.println("너굴맨 저장!!!");
						} else if (menu2 == 3) {
							// 수정
							System.out.println("수정하실 작성자의 아이디를 선택하세요");
							int WriteId = scn.nextInt();
							System.out.println("수정한 제목을 입력하세요");
							String boName = scn.next();
							System.out.println("수정한 내용을 입력하세요");
							String boWrite = scn.next();
							Board board = service.getBoard(WriteId);
							if (board == null) {
								Board b1 = new Board(boWrite, boName, WriteId);
								service.modifyBoard(b1);
								System.out.println("수정할게시글을 찾을수없어요");
							} else {
								Board b1 = new Board(boWrite, boName, WriteId);
								service.modifyBoard(b1);
								System.out.println("너굴맨이 수정햇다구요!");
							}
						} else if (menu2 == 4) {
							// 삭제
							System.out.println("삭제하실 게시글을 선택하세요");
							String boardNo = scn.next();
							service.deleteBoard(boardNo);

						} else if (menu2 == 5) {
							System.out.println("게시글을 선택하세요");
							int num = scn.nextInt();
							Board bo = service.inBoard(num);
							if (bo == null)
								System.out.println("게시글이 없어요!");

							else
								System.out.println(bo.toString());

						} else if (menu2 == 9) {
							System.out.println(
									"＼😆へ　 へ😁ヘ　 く😎/\r\n" + "ヘ/ 　　  ( ヘ　　 ( ヘ\r\n" + "　 >　 　 <　　　　く\r\n" + "");
							break;

						}
//						break;
					} // end of while
//					break;
				} // 계정이 일치하지 않을때 접근 못하게
				else if (login == null) {
					System.out.println("너굴맨이 계정을 못찾앗어,,,,");
				}

			} else if (menu == 3) {
				// 계정삭제
				System.out.println("삭제할 계정!");
				System.out.println("입력>>");
				userId = scn.nextInt();
				service.deletelogin(userId);
			} else if (menu == 9) {
				System.out.println("프로그램을 종료합니다");
				break;
			}

		} // end of while
		System.out.println("＼😆へ　 へ😁ヘ　 く😎/\r\n" + "ヘ/ 　　  ( ヘ　　 ( ヘ\r\n" + "　 >　 　 <　　　　く\r\n" + "");
	}
}