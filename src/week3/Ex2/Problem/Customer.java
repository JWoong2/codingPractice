package week3.Ex2.Problem;

public class Customer {
	private int money =10000;
	private int point =0;
	
	public void order(Food f) {
		money -= f.price;
		point += f.point;
		System.out.println(f.getName() +"��/�� �ֹ��ϼ̽��ϴ�.");
	}
	
	public int getMoney() {
		return money;
	}
	
	public int getPoint() {
		return point;
	}
	
}
