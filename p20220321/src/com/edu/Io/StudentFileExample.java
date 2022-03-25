package com.edu.Io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentFileExample {
	static Scanner scn = new Scanner(System.in);
	static List<Student> list = new ArrayList<Student>();

	public static void main(String[] args) {
//		writeStudent();
		readStudent();  //텍스트 101 홍길동 30 50 => new Student(101, 홍길동, 30 50)
		for (Student student : list) {
			System.out.println(student.toString());
		}
//		try {
//			FileWriter fw = new FileWriter("student.txt");
//
//			BufferedWriter bw = new BufferedWriter(fw);
//			while (true) {
//				System.out.println("이름를 입력하십시오..");
//				String name = scn.next();
//				if (name.equals("stop")) {
//					break;
//				}
//				bw.write(name + "\n");
//			}
//			bw.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		System.out.println("end of prog");
	}// end of main
//student.txt를 읽어드리는 메소드 

	public static void readStudent() {
		try {
			FileReader fr = new FileReader("student.txt");
			BufferedReader br = new BufferedReader(fr);
			String readStr = null;

			while ((readStr = br.readLine()) != null) {
				String[] contents = readStr.split(" ");// 스플릿 자르다 101 키위 20 30 공란을 기준으로 자름
				list.add(new Student(Integer.parseInt(contents[0]), contents[1], Integer.parseInt(contents[2]),
						Integer.parseInt(contents[3])));

				System.out.println(readStr);
			}
			br.close();
			fr.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void writeStudent() {
		try {
			FileWriter fw = new FileWriter("student.txt");

			BufferedWriter bw = new BufferedWriter(fw);
			while (true) {
				System.out.println("이름를 입력하십시오..>> 101 키위 20 30");
				String name = scn.nextLine(); // 한라인 전체를 읽어드림
				if (name.equals("stop")) {
					break;
				}
				bw.write(name + "\n");
			}
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
