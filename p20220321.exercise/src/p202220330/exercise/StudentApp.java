package p202220330.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentApp {
	List<Student> list = new ArrayList<Student>();
	Scanner scn = new Scanner(System.in);

//전체조회,입력,수정,삭제,한건조회,학생이름으로 조회
	class StudentServiceImpl implements StudentService {

		@Override
		public void insertStudent(Student student) {
			list.add(student); // 추가
		}

		@Override
		public Student getStudent(int sno) {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getStuNo() == sno) {
					return list.get(i);
				}
			}
			return null;
		}

		@Override
		public List<Student> studentList() {
			return list;
		}

		@Override
		public void modifyStudent(Student student) {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getStuNo() == student.getStuNo()) {
					list.get(i).setEngScore(student.getEngScore());
					list.get(i).setKorScore(student.getKorScore());
				}
			}
		}

		@Override
		public void deleteStudent(int sno) {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getStuNo() == sno) {
					list.remove(i);
				}
			}

		}

		@Override
		public List<Student> searchStudent(String name) {
			List<Student> searchList = new ArrayList<Student>();
			for(int i=0; i<list.size(); i++) {
				if(list.get(i))
			}
			return null;
		}

	}
}
