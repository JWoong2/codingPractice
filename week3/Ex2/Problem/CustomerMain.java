package week3.Ex2.Problem;

public class CustomerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer b = new Customer();
		Noodle nd = new Noodle();
		Rice rc = new Rice();
		
		b.order(nd);
		b.order(rc);
		
		System.out.println("���� ���� ����" + b.getMoney());
		System.out.println("���� ���ʽ� ������" + b.getPoint());
	}

}
