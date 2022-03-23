package p20220322.exercise;

public class Book {
	private String title;
	private String author;
	private String press;
	private int price;
	
	
	public Book(String title, String author, String press, int price) {
		super();
		this.title = title;
		this.author = author;
		this.press = press;
		this.price = price;
	}
	
	public void showInfo() {
		System.out.printf("책정보[제목: %-10s 저자: %-10s 출판사: %-10s 가격: %10d]\n",title,author,press,price);
	}
	
	

}
