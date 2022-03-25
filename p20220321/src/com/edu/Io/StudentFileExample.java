package com.edu.Io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StudentFileExample {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
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

	public static void writeStudent() {
		try {
		FileWriter fw = new FileWriter("student.txt");

		BufferedWriter bw = new BufferedWriter(fw);
		while (true) {
			System.out.println("이름를 입력하십시오..");
			String name = scn.next();
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
