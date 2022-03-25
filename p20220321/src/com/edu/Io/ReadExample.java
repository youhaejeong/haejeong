package com.edu.Io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadExample {
	public static void main(String[] args) {
		try {
			//문자기반의 스트림(한문자씩 읽어드림요) 입력스트림. 
			FileReader fr = new FileReader("second.txt");
			int readChar = -1;
			while((readChar = fr.read())!=-1) {
				System.out.print((char) readChar);
//			fr.read();
			}
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
