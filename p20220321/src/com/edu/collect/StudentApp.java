package com.edu.collect;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentApp { // 여기에 인터페이스를 연결해버리면 본래의 목적을 잃어버림
	// 필드 두개 선언
	List<Student> list = new ArrayList<Student>(); // list에 값을 담을 예정 //배열처럼
	// 아니 구냥 전반적으로 이해가 잘 안가눈뎀,,,,
	Scanner scn = new Scanner(System.in);

	// 클래스 안의 멤버클래스로 선언 //클래스안의 클레스를 선언한 이유는 위의 list 에 접근하기 쉽게하기 위해
	// 다른 클래스일때는 접근이 안됨
	class StudentServiceImpl implements StudentService {
		@Override
		public void insertStudent(Student student) {
			list.add(student); // 추가
		}

		@Override
		public Student getStudent(int sno) { // 학생번호로 한건만 조회
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getStuNo() == sno) { // 학생번호를 가져오는번호: getStuNo
					return list.get(i);
				}
			}
			return null;
		}

		@Override
		public List<Student> studentList() { // 전체리스트
			return list;
		}

		@Override
		public void modifyStudent(Student student) { // 학생번호 기준으로 학생번호와 일치하는 학생을 찾아서 수정
			for (int i = 0; i < list.size(); i++) { // 정보를 찾고싶을때는 반복을 해야함
				if (list.get(i).getStuNo() == student.getStuNo()) {
					list.get(i).setEngScore(student.getEngScore());// 영어점수를 수정
					list.get(i).setKorScore(student.getEngScore());// 국어점수를 수정
				}
			}
		}

	}// end of StuendtServiceImpl

	public void execute() { // 기능 구현
		// menu : 1.추가 2.리스트 3.한건조회.4.수정.9.종료
		while (true) {
			System.out.println("1.추가 2.리스트 3.한건조회.4.수정.9.종료");
			System.out.println("선택>>>> \n");

			int menu = scn.nextInt();

			if (menu == 1) {

			} else if (menu == 2) {

			} else if (menu == 3) {

			} else if (menu == 4) {

			} else if (menu == 9) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		} // end of while()
		System.out.println("==end of prog=="); // 반복문을 빠져나오지 못하면 dead code
	}
}
