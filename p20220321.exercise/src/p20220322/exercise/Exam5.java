package p20220322.exercise;

import java.util.Scanner;

//북 클래스를 선언 (필드: 책제목 저자 출판사 금액)
//생성자 (책제목,저자,출판사,금액)선언 후 스캐너클래스를 사용해 사용자의 입력을 통해 인스턴스를 생성하고 입력하 내용의 정보를 화면에 출력하는 기능 구현
public class Exam5 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("책제목>>");
		String title =scn.next();
		System.out.println("저자>>");
		String author =scn.next();
		System.out.println("출판사>>");
		String press =scn.next();
		System.out.println("가격>>");
		int price =scn.nextInt();
		
		Book book =new Book(title,author,press,price); //이런식으로해도됨 
//		new Book(title,author,press,price); //이것이 인스턴스
		book.showInfo();
		
	}
//	scn.close();

}
