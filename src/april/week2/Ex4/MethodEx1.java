package april.week2.Ex4;

import java.util.Scanner;

public class MethodEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		Stringer ch = new Stringer();
		IntArray in = new IntArray();
		
		while(run)
		{
			System.out.println("1. ���ڿ��� �Է¹޾Ƽ� �ش� ���ڿ��� ����ϴ� ���� ���� ���� �޼��� print");
			System.out.println("2. int�迭�� �Է¹޾� �׾ȿ� �ִ� ��� ���ڸ� ���ϰ� �� ���� �����ϴ� �޼��� add");
			System.out.println("3. ������(1~10)�� �����ϴ� �޼��� random_100");
			switch (sc.nextInt()) {
			case 1:
				while(run) {
					System.out.println("����� 0 �Է�");
					if(sc.nextInt() == 0 ) {
						System.out.println("����");
						ch.showAll();
					}
					
					System.out.println("���ڿ��� �Է��ϼ���");
					ch.addString(sc.next());
				}
				
				break;

			case 2 :
				while(run) {
					int num =0;
					System.out.println("0�� ���");
					num = sc.nextInt();
					if(num == 0 ) {
						System.out.println(in.addAll());
						break;
					}
					in.addArray(num);
				}
				break;
				
			case 3 : 
				RandomMethod rd = new RandomMethod();
				System.out.println(rd.random());
				break;
				
			default:
				run = false;
				break;
			}
		}
		
	}

}
