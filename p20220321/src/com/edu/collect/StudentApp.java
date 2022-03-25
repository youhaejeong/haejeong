package com.edu.collect;

import java.util.*;

public class StudentApp { // 여기에 인터페이스를 연결해버리면 본래의 목적을 잃어버림
	// 필드 두개 선언
	List<Student> list = new ArrayList<Student>(); // list에 값을 담을 예정 //배열처럼
	// 아니 구냥 전반적으로 이해가 잘 안가눈뎀,,,, // 인스턴스 하나 만들어서 진행
	Scanner scn = new Scanner(System.in);

	// 기본생성자
	public StudentApp() {
//		list.add(new Student(101, "키위새", 50, 60));
//		list.add(new Student(102, "짱구", 70, 80));
//		list.add(new Student(103, "유리", 90, 70));
//		list.add(new Student(104, "유리", 80, 60));
	}

	// 클래스 안의 멤버클래스로 선언 //클래스안의 클레스를 선언한 이유는 위의 list 에 접근하기 쉽게하기 위해
	// 다른 클래스일때는 접근이 안됨
	// 내부에서 쓰기 위해서 ----앱클래스에서 쓰기위해
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
					list.get(i).setKorScore(student.getKorScore());// 국어점수를 수정
				}
			}
		}

		@Override
		public void deleteStudent(int sno) {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getStuNo() == sno) {
					list.remove(i);
				}
//				strAry.remove(0); //0번째 인덱스값을 삭제하겠습니다. 
			}

		}

		@Override
		public List<Student> searchStudent(String name) {
			List<Student> searchList = new ArrayList<Student>();
			// 찾았다고 종료하는 것이 아님
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getStuName().equals(name)) {
					searchList.add(list.get(i));
				}
				// 같은이름이 있는지 찾아보고 있으면 searchList.add()
			}
			return searchList;
		}

		@Override
		public void saveToFile() {
System.exit(0);			
		}
	}// end of StuendtServiceImpl

	public void execute() {
		StudentService service = new StudentServiceImpl(); // 구현하는 클래스를 바꿔줬을때 나머지는 똑같이 쓰면됨.
		// 위의 것 ==> 타입 이름 = new 구현하는 클래스();
		// 기능 구현
		// menu : 1.추가 2.리스트 3.한건조회.4.수정.9.종료
		while (true) {
			System.out.println("1.추가 2.리스트 3.한건조회.4.수정.5.삭제.6.성명조회.9.종료\n");
			System.out.println("선택>>>> \n");
			int menu = scn.nextInt();
			if (menu == 1) {
				// 학생정보 추가 입력.: 학생번호,이름,영어점수,국어점수
				System.out.println("학생번호를 입력하세요..");
				int stuNo = scn.nextInt();
				System.out.println("학생성명을 업력하세요..");
				String stuName = scn.next();
				System.out.println("영어점수를 입력하세요..");
				int engScore = scn.nextInt();
				System.out.println("국어점수를 입력하세요..");
				int korScore = scn.nextInt();
				Student s1 = new Student(stuNo, stuName, engScore, korScore);
				service.insertStudent(s1);
				System.out.println("저장이 완료되었습니다...\n");
			} else if (menu == 2) {
				List<Student> list = service.studentList();
				for (Student s : list) { // for문 안에 있는것은 확장코드(리스트컬렉선에 담겨져있는만큼만 반복
					System.out.println(s.toString());
				}
			} else if (menu == 3) { // 한건 조회
				System.out.println("조회하실 학생 번호를 입력하세요..");
				int stuNo = scn.nextInt();
				Student student = service.getStudent(stuNo);
				if (student == null) {
					System.out.println("조회된 결과가 없습니다.\n");
				} else {
					System.out.println(student.toString());
					;
				}
			} else if (menu == 4) {
				System.out.println("수정하실 학생 번호를 입력하세요..");
				int stuNo = scn.nextInt();
				System.out.println("영어점수를 입력하세요..");
				int engScore = scn.nextInt();
				System.out.println("국어점수를 입력하세요..");
				int korScore = scn.nextInt();
				Student student = service.getStudent(stuNo);
				if (student == null) {
					Student s1 = new Student(stuNo, null, engScore, korScore); // 필요없는 항목은 null값으로 해도됨
					service.modifyStudent(s1);
					System.out.println("수정하실 학생을 찾을수가 없습니다..");
				} else {
					Student s1 = new Student(stuNo, null, engScore, korScore); // 필요없는 항목은 null값으로 해도됨
					service.modifyStudent(s1);
					System.out.println("처리가 완료되었습니다...\n");
				}
			} else if (menu == 5) {
				System.out.println("삭제하실 학생 번호를 입력하세요..");
				int stuNo = scn.nextInt();
				Student student = service.getStudent(stuNo);
				if (student == null) {
					service.deleteStudent(stuNo);
					System.out.println("삭제하실 학생을 찾을수가 없습니다..");
				} else {
					service.deleteStudent(stuNo);
					System.out.println("처리가 완료 되었습니다..\n");
				}
			} else if (menu == 6) {
				System.out.println("조회하실 학생의 성명을 입력하세요..");
				String stuName = scn.next();
				List<Student> list = service.searchStudent(stuName);
				for (Student s : list) {
					System.out.println(s.toString());
				}
//				List<Student> list = service.studentList();
//				for (Student s : list) { // for문 안에 있는것은 확장코드(리스트컬렉션 에 담겨져있는만큼만 반복
//					System.out.println(s.toString());
//				}
				// 전체리스트처럼 해당학생만 조회
			} else if (menu == 9) {
				System.out.println("프로그램을 종료합니다.\n");
				service.saveToFile();
				break;
			}
		} // end of while()
		System.out.println("==end of prog=="); // 반복문을 빠져나오지 못하면 dead code
	}
}
