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
			System.out.println("1.���»��� | 2. ���¸�� | 3. ���� | 4. ��� | 5. ����");
			System.out.println();
			System.out.println("���� > ");

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
		System.out.println("���¹�ȣ");
		String ano = sc.next();

		if (findAccount(ano) != null) {
			System.out.println("���ݾ� : ");
			int bal = sc.nextInt();

			if (findAccount(ano).getBalance() - bal < 0) {
				System.out.println("�ܾ� ����");
			}
			findAccount(ano).balance += bal;
		} else {
			System.out.println("���� ���¹�ȣ");
		}

	}

	private static void deposit() {
		// TODO Auto-generated method stub
		System.out.println("���¹�ȣ");
		String ano = sc.next();

		if (findAccount(ano) != null) {
			System.out.println("���ݾ� : ");
			int bal = sc.nextInt();

			findAccount(ano).balance += bal;
		} else {
			System.out.println("���� ���¹�ȣ");
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
		System.out.println("���¹�ȣ");
		String ano = sc.nextLine();
		ano = sc.nextLine();
		System.out.println("������");
		String owner = sc.nextLine();
		System.out.println("�ʱ��Աݾ�");
		int balance = sc.nextInt();
		accountArray[index++] = new Account(ano, owner, balance);

		// ��� �޼ҵ� ���� �����ϱ�
		System.out.println("���°� �����Ǿ����ϴ�.");

	}
}
