package week2.Ex5.ncs;

import java.util.Scanner;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book[] test = new Book[50];
		int index = 0;

		test[index] = new Book(index++, "SQL Plus", 50000, 5.0);
		test[index] = new Book(index++, "Java 2.0", 40000, 3.0);
		test[index] = new Book(index++, "JSP Servlet", 60000, 6.0);

		boolean run = true;

		Scanner sc = new Scanner(System.in);

		int sel;

		while (run) {
			System.out.println("1. ������ ����");
			System.out.println("2. �� å ���");
			System.out.println("3. ��� å ��������");

			sel = sc.nextInt();

			switch (sel) {
			case 1:
				break;
			case 2:
				System.out.println("å�̸�");
				String bookName = sc.nextLine();
				bookName = sc.nextLine();
				System.out.println("����");
				int price = sc.nextInt();
				System.out.println("���η�");
				double discountRate = sc.nextDouble();

				test[index] = new Book(index++, bookName, price, discountRate);
				break;
			case 3:
				System.out.println("å�̸�  ����   ������  ���� �� �ݾ�");
				System.out.println("--------------------------------");
				for (int i = 0; i < index; i++) {
					test[i].showInfo();
				}
				break;
			case 0:
				run = false;
				break;
			}
		}

	}

}
