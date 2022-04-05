package project;

import java.time.LocalDate;

public class Board {
	private LocalDate now;
	private int boardNum;
	private String boardWrite; // 작성자
	private String BoardName; // 제목
	private int writeId;

	public Board() {

	}

	public Board(LocalDate now, String boardWrite, String boardName, int writeId) {
		super();
		this.now = now;
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
		BoardName = boardName;
	}

	public int getWriteId() {
		return writeId;
	}

	public void setWriteId(int writeId) {
		this.writeId = writeId;
	}

	@Override
	public String toString() {
		return "Board [now=" + now + ", boardNum=" + boardNum + ", boardWrite=" + boardWrite + ", BoardName="
				+ BoardName + ", writeId=" + writeId + "]";
	}

//	public long getNow() {
//		return now;
//	}
//
//	public void setNow(long now) {
//		this.now = now;
//	}

}
