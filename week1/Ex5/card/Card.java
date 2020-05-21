package week1.Ex5.card;

public class Card {
	String name;
	int id;

	public Card(int id, String name ) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}
	
	public void showCardName() {
		System.out.println(name);
	}
}
