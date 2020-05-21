package week2.Ex5.ncs;

public class Book {
	String bookName;
	int bookPrice;
	double bookDiscountRate;
	int index;

	public Book(int index, String bookName, int bookPrice, double bookDiscountRate) {
		super();
		this.index = index;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookDiscountRate = bookDiscountRate;
	}

	public Book() {
		super();
	}

	public String getBookName() {
		return bookName;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public double getBookDiscountRate() {
		return bookDiscountRate;
	}

	public double getDiscountBookPrice() {
		return this.bookPrice - (bookDiscountRate * this.bookPrice / 100);
	}

	public void showInfo() {
		System.out.println(getBookName() + " " + getBookPrice() + "¿ø " + getBookDiscountRate() + "% "
				+ getDiscountBookPrice() + "¿ø");
	}

}
