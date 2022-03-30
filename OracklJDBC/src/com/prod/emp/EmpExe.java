package com.prod.emp;

import java.util.List;
import java.util.Scanner;

public class EmpExe {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		EmpDAO dao = new EmpDAO();
		// 메뉴 :1.전체리스트 2. 입력 3. 수정 4.삭제 5.한건조회 9. 종료
		while (true) {
			System.out.println("메뉴 :1.전체리스트 2.입력 3.수정 4.삭제 5.한건조회 6.다중조회 9.종료");
			System.out.println("선택>>>  ");

			int menu = scn.nextInt();

			if (menu == 1) {
				// 리스트
				List<Employee> list = dao.empList();// 전체조회기능

				System.out.println("얏호! 사원리스트!");
				for (Employee emp : list) {
					System.out.println(emp.toString());
				}
			} else if (menu == 2) {
				// 입력
				// 사원번호, lsatname, email, hiredate, jobid
//				Employee emp = new Employee();
				System.out.println("사원번호를 입력하세요..");
				int empId = scn.nextInt();

				System.out.println("이름을 입력하세요..");
				String lastName = scn.next();
				System.out.println("이메일을 입력하세요..");
				String email = scn.next();
				System.out.println("입사일을 입력하세요..");
				String hireDate = scn.next();
				System.out.println("부서를 입력하세요..");
				String jobId = scn.next();

//				Employee emp = new Employee(empId,lastName,email,hireDate,jobId);
//				dao.insertEmp(emp);
				Employee emp = new Employee();

				emp.setEmployeeId(empId);
				emp.setLastName(lastName);
				emp.setEmail(email);
				emp.setHireDate(hireDate);
				emp.setJobId(jobId);
				dao.insertEmp(emp);

			} else if (menu == 3) {
				// 수정
				// 사원번호,전화번호,firstname,salary
				System.out.println("수정하실 사원의 번호를 입력하세요");
				int empId = scn.nextInt();
				System.out.println("전화번호를 입력하세요..");
				String phone = scn.next();
				System.out.println("first name을 입력하세요");
				String firstName = scn.next();
				System.out.println("급여를 입력하세요");
				int salary = scn.nextInt();

//				Employee emp = new Employee(firstName,phone,salary,empId);
//				dao.updateEmp(emp);
				Employee emp = new Employee();
				emp.setFirstName(firstName);
				emp.setPhoneNumber(phone);
				emp.setSalary(salary);
				emp.setEmployeeId(empId);
				boolean result = dao.updateEmp(emp); //반환이 안되기때문에 그냥하면됨 
				if(result)
					System.out.println("정상적으로 완료!");
				else 
					System.out.println("유감! 안됬다리~!");
			} else if (menu == 4) {
				// 삭제
				System.out.println("삭제하실 사원의 번호를 입력하세요,,");
				int empId = scn.nextInt();

				dao.deleteEmp(empId);

			} else if (menu == 5) {
				// 한건조회
				// 사원아이디
				System.out.println("조회하실 사원의 번호를 입력하세요");
				int eid = scn.nextInt();

				Employee r = dao.searchEmp(eid); //반환값이 있음 
				if (r == null)
					System.out.println("조회할 값이 없습니다.");
				else
					System.out.println(r.toString());
			}else if(menu ==6) {
				//다중조회
				
			} else if (menu == 9) {
				// 종료
				System.out.println("프로그램을 종료합니다 ");
				break;
			}
		} // end of while
		System.out.println("end of program");
		scn.close();
//		List<Employee> list = dao.empList();// 전체조회기능
//
//		System.out.println("얏호! 사원리스트!");
//		for (Employee emp : list) {
//			System.out.println(emp.toString());
//		}
	}// end of main
}
