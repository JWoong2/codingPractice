package april.week1.Ex5;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int balance = 0;
		
		while(run) {
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			
			switch (sc.nextInt()) {
			case 1:
				System.out.println("예금액 : ");
				int depo= sc.nextInt();
				balance += depo;
				
				break;
			case 2:
				System.out.println("출금액 : ");
				depo= sc.nextInt();
				balance -= depo;
				
				break;
			case 3:
				System.out.println("계좌잔액 : " + balance);
				break;
			case 4:
				run = false;
				break;
			}
		}
	}

}
