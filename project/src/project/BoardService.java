package project;

import java.util.List;

public interface BoardService {
	public int boardNum();

	public void insertBoard(Board board);

	public List<Board> BoardList();

	public void modifyBoard(Board board);

	public void deleteBoard(String bno);

	public Board getBoard(int writeId);

	public void insertlogin(User user);

	public User login(int userId, int userpwd); // 로그인

//	public void readCount(Board board); //조회수 증가 

	public Board inBoard(int board); // 상세보기

	public void deletelogin(int bno);

}
