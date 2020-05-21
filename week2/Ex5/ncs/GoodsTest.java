package week2.Ex5.ncs;

import java.util.Scanner;

public class GoodsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goods[] GoodsManager = new Goods[50];
		int index = 0;
		
		System.out.println("다음 항목의 값을 입력하시오");
		boolean run = true;
		
		Scanner sc = new Scanner(System.in);
		int sel;
		
		while(run) {
			System.out.println("1. 새 구매항목");
			System.out.println("2. 상품정보 출력");
			System.out.println("0. 종료");
			sel = sc.nextInt();
			
			switch (sel) {
			case 1:
				System.out.println("상품명 : ");
				String name = sc.nextLine();
				name = sc.nextLine();
				System.out.println("가격 : ");
				int price = sc.nextInt();
				System.out.println("수량 : ");
				int quantity = sc.nextInt();
				GoodsManager[index++] = new Goods(name, price, quantity);		
				break;

			case 2:
				for(int i = 0; i<index; i++) {
					System.out.println(GoodsManager[i].toString());
					System.out.println("총 구매 가격 : " + GoodsManager[i].totalPrice());			
				}
				break;

			case 0 : 
				run = false;
				break;
			}
		}
		}

}
