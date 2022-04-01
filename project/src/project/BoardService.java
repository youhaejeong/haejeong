package project;

import java.util.List;

public interface BoardService {
	public void insertBoard(Board board);

	public List<Board> BoardList();

	public void modifyBoard(Board board);

	public void deleteBoard(String bno);

}