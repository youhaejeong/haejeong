package com.edu.p20220321;

public class InheritExample {
	// 학생,직장인  의 정보를 담아놓는 정보.
	//학생의 경우 : 학교, 학년
	//직장의 경우 : 직장명, 직급
	
	public static void main(String[] args) {
		Students student = new Students();
		student.setName("홍길동");
		student.setAge(15);
		student.setSchool("중앙고");
		student.setGrade(2);
		
		Worker worker = new Worker();
		worker.setName("직장인");
		worker.setAge(35);
		worker.setCompany("카카오");
		worker.setJob("개발팀장");
		
		//부모클래스의 참조변수에 자식클래스의 참조변수 자동현 변환 (promotion
		Person p1 = new Person();
		p1 =(Person) student; //자식 변수가 부모 변수에 대입 가능 
		p1 = worker;
		
		
//		student = worker; //자식끼리는할수없음 
	}

}
