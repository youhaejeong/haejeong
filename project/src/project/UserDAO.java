package project;

import java.sql.SQLException;

public class UserDAO extends DAO {
	public boolean login(String writeId, String userpwd) {
		conn = getConnect();
		String sql = "select user_pwd FROM board_inf where user_no =?";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, writeId);
			rs = psmt.executeQuery();
			if (rs.next()) {
				if (rs.getString(1).equals(userpwd)) {
					return true;// 성공
				} else {
					return false; // 실패
				}
			}
			return false;// 아이디없음
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false; // 디비오류
	}
}
