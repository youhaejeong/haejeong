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

	public User login(int userId, int userpwd);

}
