package p20220321.exercise;

import java.util.Scanner;

//문제5) Book클래스를 선언(필드:책제목, 저자, 출판사, 금액) 
//생성자(책제목, 저자, 출판사, 금액)를 선언 후 Scanner클래스를 사용하여 사용자의 입력을 통하여 인스턴스를 생성하고 
//입력한 내용을 책제목, 저자, 출판사, 금액 정보를 화면에 출력하는 기능 구현.
public class Exam {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("책제목을 입력하세요");
		String title = scn.next();
		System.out.println("저자를 입력하세요");
		String author = scn.next();
		System.out.println("출판사를 입력하세요");
		String make = scn.next();
		System.out.println("가격을 입력하세요");
		int price = scn.nextInt();

		Book book = new Book(title, author, make, price);
		System.out.println(book.bookInfo());

	}

}
