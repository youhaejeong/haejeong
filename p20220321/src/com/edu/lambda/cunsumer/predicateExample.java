package com.edu.lambda.cunsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Student {
	String name;
	String gender;
	int score;

	public Student(String name, String gender, int score) {
		super();
		this.name = name;
		this.gender = gender;
		this.score = score;
	}

}

public class predicateExample {
	public static void main(String[] args) {
		Predicate<Student> pridic = new Predicate<Student>() {

			@Override
			public boolean test(Student t) {
				return t.gender.equals("남자");
			}

		};
		double avg = avg(pridic);
		System.out.println("남학생의 평균은 " + avg);
		pridic = (s) -> s.gender.equals("여자");
		avg = avg(pridic);
		System.out.println("여학생의 평균은 " + avg);
	}

	public static double avg(Predicate<Student> pred) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("키위새", "남자", 70));
		list.add(new Student("유리", "여자", 80));
		list.add(new Student("짱구", "남자", 85));
		list.add(new Student("슬기", "여자", 88));

		int cnt = 0;
		int sum = 0;
		double avg = 0;

		for (Student student : list) {

			if (pred.test(student)) { // pred는 참거짓을 표현 참일경우 아래를 표현
				cnt++;
				sum += student.score;
			}
		}
		avg = sum / (double) cnt;
		return avg;
	}

}
