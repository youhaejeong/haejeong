package com.edu.Io;

import java.io.FileWriter;
import java.io.IOException;

public class WriterExample {
	public static void main(String[] args) {
		//출력스트림을 문자기반으로 sexond.txt
		try {
			FileWriter fw = new  FileWriter("second.txt");
			fw.write("안녕\n");
			fw.write("world\n");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end of prog");
	}

}
