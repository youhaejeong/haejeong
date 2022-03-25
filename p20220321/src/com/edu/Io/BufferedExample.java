package com.edu.Io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedExample {

	public static void main(String[] args) {

		try (FileInputStream fis = new FileInputStream("C:/temp/img.jpg");
				BufferedInputStream bis = new BufferedInputStream(fis);
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:/temp/copy3.jpg"));) {
			// 규칙임 //클로즈를 안해도됨

			int readByte = -1;
			while ((readByte = bis.read()) != -1) {
				bos.write(readByte);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end of prog");
	}
}
//밑에 있는 것처럼 해도 되고 위에처럼 해도되는데 나중에 다시 알려주신다고 하심 
//		try (FileInputStream fis = new FileInputStream("C:/temp/img.jpg");
//				BufferedInputStream bis = new BufferedInputStream(fis);
//				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:/temp/copy3.jpg"));) {
//			// 규칙임 //클로즈를 안해도됨 
//
//			int readByte = -1;
//			while ((readByte = bis.read()) != -1) {
//				bos.write(readByte);
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
