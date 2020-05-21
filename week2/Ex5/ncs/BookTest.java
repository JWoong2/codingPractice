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
			System.out.println("1. 할인율 변경");
			System.out.println("2. 새 책 등록");
			System.out.println("3. 모든 책 정보보기");

			sel = sc.nextInt();

			switch (sel) {
			case 1:
				break;
			case 2:
				System.out.println("책이름");
				String bookName = sc.nextLine();
				bookName = sc.nextLine();
				System.out.println("가격");
				int price = sc.nextInt();
				System.out.println("할인률");
				double discountRate = sc.nextDouble();

				test[index] = new Book(index++, bookName, price, discountRate);
				break;
			case 3:
				System.out.println("책이름  가격   할인율  할인 후 금액");
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
