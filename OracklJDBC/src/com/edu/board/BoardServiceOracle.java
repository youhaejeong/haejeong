package com.edu.board;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BoardServiceOracle extends DAO implements BoardService {

	@Override
	public Board infoUser(int userNo, int userPwd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Board> BoardList() {
		List<Board> list = new ArrayList<Board>();
		conn = getConnect();
		String sql = "select * from board_inf order by board_num ";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				Board board = new Board();
				board.setBoardNo(rs.getInt("board_num"));
				board.setUserName(rs.getString("user_name"));
				board.setBoardwrite(rs.getString("board_write"));
				list.add(board);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return list;
	}

	@Override
	public void insertBoard(Board board) {
		conn = getConnect();
		String sql = " insert into board_inf(board_num,board_write)\r\n" + "values(?,?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, board.getBoardNo());
			psmt.setString(2, board.getBoardwrite());
			int m = psmt.executeUpdate();
			System.out.println("너굴맨이 " + m + "건 입력 완료햇다구!");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override
	public void modifyBoard(Board board) {
		conn = getConnect();
		String sql = "update board_inf\r\n" + "set board_write = ?\r\n" + "where board_num =?";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, board.getBoardwrite());
			psmt.setInt(2, board.getBoardNo());
			int r = psmt.executeUpdate();
			System.out.println("너굴맨이" + r + "건 수정완료했따구");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override
	public void delelteBoard(int boardNo) {
		conn = getConnect();
		String sql = "delelte from board_inf\n\r" + "where board_num = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, boardNo);
			int r = psmt.executeUpdate();
			System.out.println("너굴맨이 " + r + "건 삭제했다구");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	@Override
	public Board getBoard(int userNo) {
		// TODO Auto-generated method stub
		return null;
	}

}
