package week1.Ex5.card;

import java.util.Scanner;

public class CardList {
	Card cards[];
	int index=0;
	public CardList(int n ) {
		cards = new Card[n];
		cards[index++] = new Card(1, "신한");
		cards[index++] = new Card(2, "한국");
		cards[index++] = new Card(3, "국민");
		cards[index++] = new Card(4, "카카오");
		cards[index++] = new Card(5, "Chase");
	}
	
	public void showCard() {
		int sel;
		Scanner sc = new Scanner(System.in);
		cards[sc.nextInt()-1].showCardName();
	}
	
	public String getName(int num) {
		return cards[num-1].getName();
	}
	
}
