package project;

public class Board {
private String date;
	private int boardNum;
	private String boardWrite; // 작성자
	private String BoardName; // 제목
	private int writeId;
	public static int lastIndex = 1;

	public Board() {

	}

	public Board(String date,int boardNum, String boardWrite, String boardName, int writeId) {
		super();
		this.date=date;
		this.boardNum = boardNum;
		this.boardWrite = boardWrite;
		this.BoardName = boardName;
		this.writeId = writeId;
	}

	public Board(String boardWrite, String boardName) {
		this.boardWrite = boardWrite;
		this.BoardName = boardName;
	}

	public int getBoardNum() {
		return boardNum;
	}

	public void setBoardNum(int boardNum) {
		this.boardNum = boardNum;
	}

	public String getBoardWrite() {
		return boardWrite;
	}

	public void setBoardWrite(String boardWrite) {
		this.boardWrite = boardWrite;
	}

	public String getBoardName() {
		return BoardName;
	}

	public void setBoardName(String boardName) {
		BoardName = boardName;
	}

	public int getWriteId() {
		return writeId;
	}

	public void setWriteId(int writeId) {
		this.writeId = writeId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
