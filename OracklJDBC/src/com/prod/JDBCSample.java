package com.prod;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//ojdbc 라이브러리 오라클 DB연결(db접속주소,hr,hr),Connection 객체
//query실행(Statement,preparedStatement)
public class JDBCSample {
	// DriverManger
	static Connection conn;
	static Statement stmt;
	static ResultSet rs;
	static PreparedStatement psmt;

	public static Connection getConnect() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		System.out.println("얏호! 연결성공");
		return conn;
	}

	public static void disconnect() {
		try {
			if (rs != null)
				rs.close();

			if (stmt != null)
				stmt.close();

			if (psmt != null)
				psmt.close();

			if (conn != null)
				conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		conn = getConnect(); // DB연결작업// 이떄는 불러오기위한 용도로 널값임
		

		// Statement생성 쿼리를 실행하고 가져옴
		try {

			stmt = conn.createStatement();
			// 입력 사원번호,last_name 입사일자 이메일 job_id
			int emp_id = 302;
			String last_name = "밍밍";
			String hire_date = "2020-03-05";
			String email = "kildong@email.com";
			String job = "IT_prog";

			String fn = "인생무상";
			String pn = "010-1234-1234";
			int salary = 6000;

			String sql = "delete from emp_java\r\n" + "where employee_id = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, emp_id);

//					"update emp_java\r\n"//
//					+ "set first_name = ?,\r\n"//
//					+ "    phone_number = ?,\r\n"//
//					+ "    salary=?\r\n"//
//					+ "where employee_id = ?";
//			psmt = conn.prepareStatement(sql);
//			psmt.setString(1, fn);
//			psmt.setString(2, pn);
//			psmt.setInt(3, salary);
//			psmt.setInt(4, emp_id);
//			 내용 수정
//					"update emp_java\r\n" //
//					+ "set first_name = '" + fn + "',\r\n" //
//					+ "    phone_number = '" + pn//
//					+ "',\r\n" + "      email = '" + email + "',\r\n"//
//					+ "    salary= " + salary + "\r\n"//
//					+ "where employee_id = " + emp_id + "";
//			
//                   값을 입력
//					"insert into emp_java (employee_id, last_name, email, hire_date, job_id)" + //
//					"values (" + emp_id + ", '" + last_name + "', '" + email + "', '" + hire_date + "','" + job + "')";
			int r = psmt.executeUpdate(); // 입력,수정,삭제
//			int r = psmt.executeUpdate(sql); // 입력,수정,삭제
			System.out.println(r + "건 입력됨><");
			// 조회
//			rs = stmt.executeQuery("select * from emp_java");
//			while (rs.next()) { //
//				System.out.println("사원번호>> " + rs.getInt("employee_id"));
//				System.out.println("이름>>" + rs.getString("first_name"));
//
//			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		disconnect();// DB연결 끊는 작업
	}
}