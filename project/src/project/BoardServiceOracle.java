package project;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BoardServiceOracle extends DAO implements BoardService {
	// 게시판 넘버 자동 매기기
	@Override
	public int boardNum() {
		conn = getConnect();
		String sql1 = "select max(board_num) from  board";
		try {
			psmt = conn.prepareStatement(sql1);
			rs = psmt.executeQuery();
			if (rs.next()) {
				return rs.getInt(1) + 1;

			}

		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			disconnect();

		}
		return -1;
	}

//입력
	@Override
	public void insertBoard(Board board) {
		int newseq = boardNum();
		conn = getConnect();
		String sql = " insert into  board(board_date,board_num,board_write,board_name,board_writeid)\r\n"
				+ "values(sysdate,?,?,?,?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, newseq);
			psmt.setString(2, board.getBoardWrite());
			psmt.setString(3, board.getBoardName());
			psmt.setInt(4, board.getWriteId());
			int r = psmt.executeUpdate();
			System.out.println(r + "건입력");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

//전체리스트
	@Override
	public List<Board> BoardList() {
		List<Board> list = new ArrayList<Board>();
		conn = getConnect();
		String sql = "select * from  board order by board_num";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {

				Board bo = new Board();
				bo.setBoardWrite(rs.getString("board_write"));
				bo.setBoardNum(rs.getInt("board_num"));
				bo.setWriteId(rs.getInt("board_writeid"));
				bo.setBoardName(rs.getString("board_name"));
				bo.setNow(rs.getString("board_date"));
				list.add(bo);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}

//수정
	@Override
	public void modifyBoard(Board board) {

		conn = getConnect();
		String sql = "update  board\r\n" //
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

	// 삭제
	@Override
	public void deleteBoard(String bno) {
		conn = getConnect();
		String sql = "delete from  board\r\n" + "where board_num=?";
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

//수정을 위한 한건조회
	@Override
	public Board getBoard(int bno) {
		Board board = new Board();
		conn = getConnect();
		String sql = "select * from  board where board_num=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, bno);
			psmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return board;
	}

//로그인
	@Override
	public User login(int userId, int userpwd) {
		User user1 = new User();
		conn = getConnect();
		String sql = "select * FROM board_info where user_no =? AND user_pwd =?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, userId);
			psmt.setInt(2, userpwd);
			rs = psmt.executeQuery();
			if (rs.next()) {
				user1.setUserNo(rs.getInt("user_no"));
				user1.setUserPwd(rs.getInt("user_pwd"));
				return user1;

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return null;
	}

//가입
	@Override
	public void insertlogin(User user) {
		conn = getConnect();
		String sql = "insert into board_info(user_no,user_pwd)" + "values(?,?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, user.getUserNo());
			psmt.setInt(2, user.getUserPwd());
			int m = psmt.executeUpdate();
			System.out.println(m + "건이 너굴맨 둥지에 추가!!");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

//상세보기
	@Override
	public Board inBoard(int board) {
		conn = getConnect();
		Board bo = new Board();

		String sql = "select board_name,board_writeid,board_write,board_date,board_num from board where board_num = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, board);
			rs = psmt.executeQuery();
			if (rs.next()) {
				bo.setBoardName(rs.getString("board_name"));
				bo.setWriteId(rs.getInt("board_writeid"));
				bo.setBoardWrite(rs.getString("board_write"));
				bo.setNow(rs.getString("board_date"));
				bo.setBoardNum(rs.getInt("board_num"));
				return bo;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return null;
	}

	// 계정 삭제
	@Override
	public void deletelogin(int bno) {
		conn = getConnect();
		String sql = "delete from board_info\r\n" + "where user_no=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, bno);
			int r = psmt.executeUpdate();
			System.out.println("너굴맨이 삭제햇다리");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

//	conn = getConnect();
//	String sql = "delete from  board\r\n" + "where board_num=?";
//	try {
//		psmt = conn.prepareStatement(sql);
//		psmt.setString(1, bno);
//		int r = psmt.executeUpdate();
//		System.out.println(r + "건을 너굴맨이 삭제했다리!");
//	} catch (SQLException e) {
//		e.printStackTrace();
//	} finally {
//		disconnect();
//	}
//}

//조회수
//	@Override
//	public void readCount(Board board) {
//		int count = 0;
//		conn = getConnect();
//		String sql = "select read_count from board where board_num = ?";
//		String sql2 = "update board set read_count=? where board_num=?";
//		try {
//			psmt = conn.prepareStatement(sql);
//			psmt.setInt(1, board.getBoardNum());
//			rs = psmt.executeQuery();
//			if (rs.next()) {
//				count = rs.getInt(1);
//				count++;
//			}
//			psmt = conn.prepareStatement(sql2);
//			psmt.setInt(1, count);
//			psmt.setInt(2, board.getBoardNum());
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}

}
