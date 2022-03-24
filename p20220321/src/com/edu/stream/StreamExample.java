package com.edu.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Stream;

class Student implements Comparable<Student> {
	String name;
	String gender;
	int score;
	int point;

	// 생성자
	public Student(String name, String gender, int score) {
		super();
		this.name = name;
		this.gender = gender;
		this.score = score;
	}

	public Student(String name, String gender, int score, int point) {
		super();
		this.name = name;
		this.gender = gender;
		this.score = score;
		this.point = point;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", gender=" + gender + ", score=" + score + ", point=" + point + "]";
	}

	@Override
	public int compareTo(Student student) {
		// this 와 student 비교 : this, student => 음수, 내림차순 :양수
//		if (this.score < student.score) {
//			return -1000;
//		} else {
//			return 9000;
//		} //위처럼해도되고 아래처럼 해도된고
//		return student.score-this.score; //60, (배교대상)70 ==> 60-70=-10 음수값 오름차순 하겠음  반대로 양수가 나오면 내림차순하겠음 
		return (this.score + this.point) - (student.score + student.point); //포인트와 점수를 더해서 음수면 오름차순 양수면 내림차순 
	}

}

public class StreamExample {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("키위새", "남자", 70));
		list.add(new Student("유리", "여자", 80));
		list.add(new Student("짱구", "남자", 85));
		list.add(new Student("슬기", "여자", 88));

		// 평균
		int sum = 0, cnt = 0;
		double avg = 0;
		for (Student student : list) {
			if (student.gender.equals("남자")) {
				sum += student.score;
				cnt++;
			}

		}

		avg = sum / (double) cnt;
		System.out.println("컬렉션을 통해 가져온 평균값: " + avg);
		Stream<Student> stream = list.stream();// 스트림생성
		OptionalDouble od = stream.filter((s) -> s.gender.equals("남자")).mapToInt(s -> s.score).average();

		avg = od.getAsDouble();
		System.out.println("스트림을 통해 가져온 평균값: " + avg);

//그냥 출력해본거 ㅎ 
//		Stream<Student> stream = list.stream(); // 스트림생성.
//		stream.forEach((Student t) -> { // 여기들어있느 각각의 데이터에 대해 라는게 폴인치
//			System.out.println("이름: " + t.name + ",성별: " + t.gender + ", 점수: " + t.score);
//
//		});

	}

}
