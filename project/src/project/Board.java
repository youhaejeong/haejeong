package project;

public class Board {

	private int boardNum;
	private String boardWrite; // 작성자
	private String BoardName; // 제목
	private int writeId;
	public static int lastIndex = 1;

	public Board() {

	}

	public Board(int boardNum, String boardWrite, String boardName, int writeId) {
		super();
		this.boardNum = boardNum;
		this.boardWrite = boardWrite;
		BoardName = boardName;
		this.writeId = writeId;
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

}
