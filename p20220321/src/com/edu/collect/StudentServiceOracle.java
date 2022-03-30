package com.edu.collect;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentServiceOracle extends DAO implements StudentService {

	@Override
	public void insertStudent(Student student) {
//입력
		conn = getConnect();
		String sql = "insert into student_info(student_no, student_name,eng_score, kor_score)\r\n" + "values(?,?,?,?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, student.getStuNo());
			psmt.setString(2, student.getStuName());
			psmt.setInt(3, student.getEngScore());
			psmt.setInt(4, student.getKorScore());
			int m = psmt.executeUpdate();
			System.out.println(m + "건 입력 완료!");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override
	public Student getStudent(int sno) {
		// 한건조회
		return null;
	}

	@Override
	public List<Student> studentList() {
		// 전체조회
		List<Student> list = new ArrayList<Student>(); // 조회된결과값을 담기위한 컬렉션
		conn = getConnect();
		String sql = "select * from student_info order by student_no";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery(); // 실행건수만큼 반복자
			while (rs.next()) { // 반복자를 통해 요소를 가지고 올 수 있는지 체크, 있으면 하나 가지고옴
				Student student = new Student();
				student.setStuNo(rs.getInt("student_no"));
				student.setStuName(rs.getString("student_name"));
				student.setEngScore(rs.getInt("eng_score"));
				student.setKorScore(rs.getInt("kor_score"));
				list.add(student); // list 에 student 값을 넣음
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list; // student 값을 가져옴
	}

	@Override
	public void modifyStudent(Student student) {
//수정 학생번호에 따라 영어와 국어만 수정 
		conn = getConnect();
		String sql = "update student_info\r\n" //
				+ "set eng_score =?,\r\n" //
				+ "    kor_score =?\r\n"//
				+ "where student_no = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, student.getEngScore());
			psmt.setInt(2, student.getKorScore());
			psmt.setInt(3, student.getStuNo());

			int r = psmt.executeUpdate();
			System.out.println(r + "건 수정 완료!");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	@Override
	public void deleteStudent(int sno) {
		conn = getConnect();
		String sql = "delete from student_info\r\n" //
				+ "where student_no = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, sno);
			int r = psmt.executeUpdate();
			System.out.println(r + "건 삭제완료!");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
//삭제
	}

	@Override
	public List<Student> searchStudent(String name) {
		List<Student> list = new ArrayList<Student>();
		Student stu = null;

//		Student stu = null;
		// 학생이름으로 조회
		// 모르면놔둠
		conn = getConnect();

		String sql = "select *\r\n" //
				+ "from student_info\r\n" //
				+ "where student_name like ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, name);
			rs = psmt.executeQuery();
			while (rs.next()) {
				stu = new Student();
				stu.setStuNo(rs.getInt("student_no"));
				stu.setStuName(rs.getString("student_name"));
				stu.setEngScore(rs.getInt("eng_score"));
				stu.setKorScore(rs.getInt("kor_score"));
				list.add(stu);
			} 

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return list;
	}

	@Override
	public void saveToFile() {
//할필요없음
	}

}
