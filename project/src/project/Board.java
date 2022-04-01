package project;

public class Board {
	private String boardDate;
	private int boardNum;
	private String boardWrite; // 작성자
	private String BoardName; // 제목
	private String writeId;

	public Board() {

	}

	public Board(String boardDate, int boardNum, String boardWrite, String boardName, String writeId) {
		super();
		this.boardDate = boardDate;
		this.boardNum = boardNum;
		this.boardWrite = boardWrite;
		BoardName = boardName;
		this.writeId = writeId;
	}

	public String getBoardDate() {
		return boardDate;
	}

	public void setBoardDate(String boardDate) {
		this.boardDate = boardDate;
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

	public String getWriteId() {
		return writeId;
	}

	public void setWriteId(String writeId) {
		this.writeId = writeId;
	}


}
