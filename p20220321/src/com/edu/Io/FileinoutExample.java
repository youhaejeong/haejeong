package com.edu.Io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileinoutExample {
	//기본스트림임 
	public static void main(String[] args) {
		try {
			FileInputStream fis1 = new FileInputStream("C:/temp/img1.jpg");
			FileOutputStream fos1 = new FileOutputStream("C:/temp/copy.jpg");
			int readByte = -1;
			while ((readByte = fis1.read()) != -1) {
				fos1.write(readByte);
			}
			fos1.close();
			fis1.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end of prog");

		try

		{
			FileInputStream fis = new FileInputStream("C:/temp/img.jpg");
			FileOutputStream fos = new FileOutputStream("C:/temp/copy2.jpg");
			int readByte = -1;
			byte[] readBytes = new byte[100];
			while ((readByte = fis.read(readBytes)) != -1) {
				fos.write(readBytes);
			}
			fos.close();
			fis.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end of prog");

		try

		{
			FileInputStream fis = new FileInputStream("C:/temp/img1.jpg");
			FileOutputStream fos = new FileOutputStream("C:/temp/copy2.jpg");
			int readByte = -1;
			byte[] readBytes = new byte[100];
			while ((readByte = fis.read(readBytes)) != -1) {
				fos.write(readBytes, 0,readByte); //70byte ==>
			}
			fos.close();
			fis.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end of prog");
	}
}
