package may.week4.Ex3.Excel;

public class Book {
	private int no;
	private String title;
	private String publisher;
	private int price;
	
	public Book(int no, String title, String publisher, int price) {
		super();
		this.no = no;
		this.title = title;
		this.publisher = publisher;
		this.price = price;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return no + " \t " + title + " \t "+ publisher +" \t " +price;
	}
}
