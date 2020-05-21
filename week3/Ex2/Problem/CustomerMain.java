package week3.Ex2.Problem;

public class CustomerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer b = new Customer();
		Noodle nd = new Noodle();
		Rice rc = new Rice();
		
		b.order(nd);
		b.order(rc);
		
		System.out.println("현재 남은 돈은" + b.getMoney());
		System.out.println("현재 보너스 점수는" + b.getPoint());
	}

}
