package project;

public class Board {
	private String now; // String
	private int boardNum;
	private String boardWrite; // 내용
	private String BoardName; // 제목
	private int writeId;
	private int readCount;

	public Board() {

	}

	public Board(String now, String boardWrite, String boardName, int writeId) {
		this.now = now;
		this.boardWrite = boardWrite;
		this.BoardName = boardName;
		this.writeId = writeId;
	}

	public Board(String boardWrite, String boardName, int writeId) {
		this.boardWrite = boardWrite;
		this.BoardName = boardName;
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
		this.BoardName = boardName;
	}

	public int getWriteId() {
		return writeId;
	}

	public void setWriteId(int writeId) {
		this.writeId = writeId;
	}

	public String getNow() {
		return now;
	}

	public void setNow(String now) {
		this.now = now;
	}

	public int getReadCount() {
		return readCount;
	}

	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}

	@Override
	public String toString() {
		return "너굴맨의 목록 [작성시간: " + now + ", 게시글번호: " + boardNum + ", 내용: " + boardWrite + ", 제목: " + BoardName
				+ ", 닉네임: " + writeId + ", 조회수: " + readCount + "]";
	}

}
