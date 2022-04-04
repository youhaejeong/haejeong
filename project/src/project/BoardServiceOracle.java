package project;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BoardServiceOracle extends DAO implements BoardService {
	@Override
	public void boardNum(Board board) {
		conn = getConnect();
		String sql1 = "select max(board_num) from board_inf";
		try {
			psmt = conn.prepareStatement(sql1);
			rs = psmt.executeQuery();
			while (rs.next()) {
				Board bo = new Board();
				bo.setBoardNum(rs.getInt("board_num"));

			}

		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			disconnect();

		}
	}

	@Override
	public void insertBoard(Board board) {

		String sql = " insert into board_inf(board_date,board_num,board_write,board_name,board_writeid)\r\n"
				+ "values(?,?,?,?,?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, board.getDate());
			psmt.setInt(2, board.getBoardNum());
			psmt.setString(3, board.getBoardWrite());
			psmt.setString(4, board.getBoardName());
			psmt.setInt(5, board.getWriteId());
			int m = psmt.executeUpdate();
			System.out.println(m + "건을 너굴맨이 입력 완료!");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	@Override
	public List<Board> BoardList() {
		List<Board> list = new ArrayList<Board>();
		conn = getConnect();
		String sql = "select * from board_inf order by board_num";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				Board bo = new Board();
				bo.setBoardNum(rs.getInt("board_num"));
				bo.setWriteId(rs.getInt("board_writeid"));
				bo.setBoardName(rs.getString("board_name"));
				bo.setBoardWrite(rs.getString("borad_write"));

				list.add(bo);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}

	@Override
	public void modifyBoard(Board board) {

		conn = getConnect();
		String sql = "update board_inf\r\n" //
				+ "set board_name = ?,\r\n" //
				+ "    board_write = ?\r\n"//
				+ "where board_writeid= ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, board.getBoardName());
			psmt.setString(2, board.getBoardWrite());
			psmt.setInt(3, board.getWriteId());
			int r = psmt.executeUpdate();
			System.out.println(r + "건을 너굴맨이 수정했다귯!");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override
	public void deleteBoard(String bno) {
		conn = getConnect();
		String sql = "delete from board_inf\r\n" + "     where board_num=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, bno);
			int r = psmt.executeUpdate();
			System.out.println(r + "건을 너굴맨이 삭제했다리!");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override
	public Board getBoard(int bno) {
		List<Board> list = new ArrayList<Board>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getBoardNum() == bno) {
				return list.get(i);
			}

		}

		return null;
	}

}
