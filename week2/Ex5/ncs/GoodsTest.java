package week2.Ex5.ncs;

import java.util.Scanner;

public class GoodsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goods[] GoodsManager = new Goods[50];
		int index = 0;
		
		System.out.println("���� �׸��� ���� �Է��Ͻÿ�");
		boolean run = true;
		
		Scanner sc = new Scanner(System.in);
		int sel;
		
		while(run) {
			System.out.println("1. �� �����׸�");
			System.out.println("2. ��ǰ���� ���");
			System.out.println("0. ����");
			sel = sc.nextInt();
			
			switch (sel) {
			case 1:
				System.out.println("��ǰ�� : ");
				String name = sc.nextLine();
				name = sc.nextLine();
				System.out.println("���� : ");
				int price = sc.nextInt();
				System.out.println("���� : ");
				int quantity = sc.nextInt();
				GoodsManager[index++] = new Goods(name, price, quantity);		
				break;

			case 2:
				for(int i = 0; i<index; i++) {
					System.out.println(GoodsManager[i].toString());
					System.out.println("�� ���� ���� : " + GoodsManager[i].totalPrice());			
				}
				break;

			case 0 : 
				run = false;
				break;
			}
		}
		}

}
