package week3.Ex2.Problem;

public abstract class Food {
	int price;
	int point;
	int name;
	
	public Food(int price) {
		super();
		this.price = price;
		this.point = price / 10;
	}

	public abstract String getName();
	
}
