package week3.Ex3.ClassProblem;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);
	private static int index = 0;

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println();
			System.out.println("1.계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println();
			System.out.println("선택 > ");

			int sel = sc.nextInt();

			switch (sel) {
			case 1:
				createAccount();
				break;

			case 2:
				accountList();
				break;

			case 3:
				deposit();
				break;
			case 4:
				withdraw();
				break;
			case 5:
				run = false;
				break;

			default:
				break;
			}
		}
	}

	private static void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("계좌번호");
		String ano = sc.next();

		if (findAccount(ano) != null) {
			System.out.println("예금액 : ");
			int bal = sc.nextInt();

			if (findAccount(ano).getBalance() - bal < 0) {
				System.out.println("잔액 부족");
			}
			findAccount(ano).balance += bal;
		} else {
			System.out.println("없는 계좌번호");
		}

	}

	private static void deposit() {
		// TODO Auto-generated method stub
		System.out.println("계좌번호");
		String ano = sc.next();

		if (findAccount(ano) != null) {
			System.out.println("예금액 : ");
			int bal = sc.nextInt();

			findAccount(ano).balance += bal;
		} else {
			System.out.println("없는 계좌번호");
		}
	}

	private static void accountList() {
		// TODO Auto-generated method stub
		for (int i = 0; i < index; i++) {
			System.out.println(
					accountArray[i].getAno() + " " + accountArray[i].getOwner() + " " + accountArray[i].getBalance());
		}
	}

	private static Account findAccount(String ano) {
		for (int i = 0; i < index; i++) {
			if (accountArray[i].getAno().equals(ano)) {
				return accountArray[i];
			}
		}
		return null;
	}

	private static void createAccount() {
		System.out.println("계좌번호");
		String ano = sc.nextLine();
		ano = sc.nextLine();
		System.out.println("계좌주");
		String owner = sc.nextLine();
		System.out.println("초기입금액");
		int balance = sc.nextInt();
		accountArray[index++] = new Account(ano, owner, balance);

		// 결과 메소드 새로 구성하기
		System.out.println("계좌가 생성되었습니다.");

	}
}
