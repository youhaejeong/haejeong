package p20220321.exercise;
//책제목, 저자, 출판사, 금액
public class Book {
	private String title;
	private	String author;
	private	String make;
	private int price;
	
	
	
	
	
	public Book(String title, String author, String make, int price) {
		super();
		this.title = title;
		this.author = author;
		this.make = make;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String bookInfo() {
		String str = "=========================================\n";
		str +="책제목: " + this.title +"\n";
		str +="저자: " + this.author + "\n";
		str +="출판사: " + this.make +"\n";
		str +="가격: "+ this.price +"\n";
		str +="=========================================";
		return str;
	}
	 
}
