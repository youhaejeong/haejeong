package com.edu.board;

import java.util.List;

public interface BoardService {
	// 로그인
	public Board infoUser(int userNo, int userPwd);

	// 조회
	public List<Board> BoardList();

	// 입력
	public void insertBoard(Board board);

	// 수정
	public void modifyBoard(Board board);

	// 삭제
	public void delelteBoard(int boardNo);

	// 게시글 조회
	public Board getBoard(int userNo);

}
