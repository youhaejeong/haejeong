package com.prod.emp;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpDAO extends DAO {
	// 전체조회
	public List<Employee> empList() {
		List<Employee> employees = new ArrayList<Employee>();
		conn = getConnect();
		try {
			psmt = conn.prepareStatement("select * from emp_java");
			rs = psmt.executeQuery(); // 조회할떄executeQuery
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setEmployeeId(rs.getInt("employee_id")); // employees.employee_id
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setSalary(rs.getInt("salary"));
				emp.setHireDate(rs.getString("hire_date").substring(0, 10));
				emp.setJobId(rs.getString("job_id"));

				employees.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return employees;
	}

	// 한건조회
	// Employee 리턴 전체리스트 참고 "select * from emp_java where employee_id = ?")
	// while 필요없이 파라매터 하나 선언해줘야함
	public Employee searchEmp(int eid) {
		conn = getConnect();
		Employee emp = null;
		emp = new Employee();
		String sql = "select * from emp_java where employee_id = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, eid);
			rs = psmt.executeQuery(); // 조회할떄executeQuery
			if (rs.next()) {

				emp.setEmployeeId(rs.getInt("employee_id")); // employees.employee_id
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setSalary(rs.getInt("salary"));
				emp.setHireDate(rs.getString("hire_date").substring(0, 10));
				emp.setJobId(rs.getString("job_id"));

				return emp;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return null;
	}

	// 입력처리 excuteUpdate //괄호안에 매개값을 받아올것을 적음
	public void insertEmp(Employee emp) { // return구문이 필요가 없음
		conn = getConnect(); // 커넥션 값부터 가져옴
		String sql = "insert into emp_java(employee_id, last_name, email, hire_date,job_id)\r\n"
				+ "values (?, ?,?,?,?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, emp.getEmployeeId());// ? <= 매개변수값중에서 employeeId 필드 //setInt 인 이유는 가져올 값이 int값이라서
			psmt.setString(2, emp.getLastName());
			psmt.setString(3, emp.getEmail());
			psmt.setString(4, emp.getHireDate());
			psmt.setString(5, emp.getJobId());
			int r = psmt.executeUpdate(); // 입력할때는 excuteUpdate //실행된 건수 반환
			System.out.println("유후!" + r + "건 입력 완료!");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally { // 오류가 나더라도 강제 실행
			disconnect();
		}

	}

	// 수정처리
	public boolean updateEmp(Employee emp) {
		conn = getConnect();
		String sql = "update emp_java\r\n"//
				+ "set first_name = ?,\r\n"//
				+ "    phone_number = ?,\r\n"//
				+ "    salary =?\r\n"//
				+ "where employee_id = ?"; //
		try {
			psmt = conn.prepareStatement(sql);
			// 파라메터(?) 값을 지정
			psmt.setString(1, emp.getFirstName());
			psmt.setString(2, emp.getPhoneNumber());
			psmt.setInt(3, emp.getSalary());
			psmt.setInt(4, emp.getEmployeeId());

			int r = psmt.executeUpdate(); // 실행부분
			System.out.println(r + "건 수정 완료!");

			if (r > 0) { //수정된 건 이 하나라도 있어야 참값이 나옴 
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { // 오류가 나더라도 강제 실행
			disconnect();
		}
		return false;
	}

	// 삭제처리
	public void deleteEmp(int empId) {
		conn = getConnect();
		String sql = "delete from emp_java\r\n"//
				+ "where employee_id =?"; // 쿼리작성 => ? 작성
		try {
			psmt = conn.prepareStatement(sql);
			// 파라메터(?) 값을 지정
			psmt.setInt(1, empId);

			int r = psmt.executeUpdate(); // 실행부분
			System.out.println(r + "건 삭제 완료!");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { // 오류가 나더라도 강제 실행
			disconnect();
		}//

	}
}
