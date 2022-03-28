package com.edu.collect;

import java.io.*;

//StudentServiceImpl (중첩클래스의 기능 대체)
//입력,수정,삭제 => 파일에 저장이 되도록 
import java.util.*;

public class StudentServiceFile implements StudentService {

	List<Student> list = new ArrayList<Student>();
	File file;

	// 기본생성자에 파일에 저장되어 있는 파일을 읽어서 리스트 값을 더해줌
	public StudentServiceFile() {
		try {
			FileReader fr = new FileReader("studentList.data");
			BufferedReader br = new BufferedReader(fr);
			String readBuffer = null;
			while ((readBuffer = br.readLine()) != null) {
				String[] contents = readBuffer.split(",");
				// 컴마를 기준으로 분류 ex) 홍길동,101,80,90
//			contents[0] <= 101, contents[1]<= 90, contents[3] <=80
				list.add(new Student(Integer.parseInt(contents[0]), contents[1], Integer.parseInt(contents[2]),
						Integer.parseInt(contents[3])));
			}
			br.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void insertStudent(Student student) {
		list.add(student);
	}

	@Override
	public Student getStudent(int sno) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getStuNo() == sno) { // 학생번호를 가져오는번호: getStuNo
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
		}

	}

	@Override
	public List<Student> searchStudent(String name) {
		List<Student> searchList = new ArrayList<Student>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getStuName().equals(name)) {
				searchList.add(list.get(i));
			}
		}
		return searchList;
	}

	@Override
	public void saveToFile() {
		// 작성했던 ArrayList<Student> list의 값을 파일에 저장
		try {
			FileWriter fw = new FileWriter("studentList.data");
			BufferedWriter bw = new BufferedWriter(fw);// 보조스트림의 생성자의 매개값으로 기본스트림.

			for (Student stud : list) {
				bw.write(stud.getStuNo() + "," + stud.getStuName() + "," + stud.getEngScore() + "," //
						+ stud.getKorScore() + "\n");
			}
			bw.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
