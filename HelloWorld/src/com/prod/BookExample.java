package com.prod;

public class BookExample {
	public static void main(String[] args) {
		// 책(책 제목,저자, 출판사 ,가격)
		Book book1 = new Book();
		book1.bookName = "혼공자";
		book1.bookWrite = "신용권";
		book1.bookMake = "한빛미디어";
		book1.price = 24000;

		Book book2 = new Book();
		book2.bookName = "powerJava";
		book2.bookWrite = "천인국";
		book2.bookMake = "인피니티";
		book2.price = 35000;

		Book book3 = new Book();
		book3.bookName = "재밌는 Java";
		book3.bookWrite = "이호준";
		book3.bookMake = "인피니티";
		book3.price = 20000;

		Book[] books = { book1, book2, book3 };
		for (int i = 0; i < books.length; i++) {
			if (books[i].bookMake == "인피니티") {
				System.out.println("책의 이름: " + books[i].bookName);
				System.out.println("책의 저자: " + books[i].bookWrite);
				System.out.println("책의 가격: " + books[i].price);
				System.out.println("=================================");
			}
		}
		for (int i = 0; i < books.length; i++) {
			if (books[i].bookWrite == "신용권") {
				System.out.println("책의 이름:" + books[i].bookName);
				System.out.println("=================================");
			}
		}

	}
}
