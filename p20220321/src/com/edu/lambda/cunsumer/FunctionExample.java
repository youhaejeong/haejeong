package com.edu.lambda.cunsumer;

import java.util.function.ToIntFunction;

import com.edu.collect.Student;
//Function 인터페이스 : 매핑작업. (Student -> int)
public class FunctionExample {
	public static void main(String[] args) {
		ToIntFunction<Student> func = (student) -> student.getEngScore() + student.getKorScore();

		int result = func.applyAsInt(new Student(101, "키위", 80, 90));
		System.out.println("결과값은 " + result);
	}
}
