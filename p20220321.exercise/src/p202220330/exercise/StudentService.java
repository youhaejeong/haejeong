package p202220330.exercise;

import java.util.List;

public interface StudentService {
//인터페이스를 위한 추상메소드
	// 기능을 위해 다른클래스에서 구현해줘야함
	// 전체조회,입력,수정,삭제,한건조회,학생이름으로 조회
	public void insertStudent(Student student);

	public Student getStudent(int sno);

	public List<Student> studentList();

	public void modifyStudent(Student student);

	public void deleteStudent(int sno);

	public List<Student> searchStudent(String name);

}
