package week1.Ex5.student;

import java.util.Scanner;

import week1.Ex5.card.CardList;

public class StudentMlist {
	Student students[];
	int index = 0;

	public StudentMlist(int n) {
		students = new Student[n];
		students[index++] = new Student(index, "����", 1234, 1, "����");
		students[index++] = new Student(index, "����", 1111, 2, "�ѱ�");
	}

	public void AddStudent() {
		int id, cardNum;
		int password;
		String name;
		CardList card = new CardList(50);

		Scanner sc = new Scanner(System.in);
		System.out.println("ID : ");
		id = sc.nextInt();
		System.out.println("����� ��й�ȣ : ");
		password = sc.nextInt();
		System.out.println("�̸� : ");
		name = sc.next();
		System.out.println("ī��� ��ȣ : ");
		cardNum = sc.nextInt();

		students[index++] = new Student(id, name, password, cardNum, card.getName(cardNum));

	}

	public void showStudentInfo() {
		for (int i = 0; i < index; i++) {
			students[i].showStudentData();
		}
	}

	public void checkBal(int id) {

		Scanner sc = new Scanner(System.in);
		System.out.println("password : ");

		if (students[id - 1].checkPassword(sc.nextInt())) {
			System.out.println(students[id - 1].balance);
		}
	}

	public boolean checkAvailable(int id) {
		return students[id-1].account;
	}
	
	public boolean checkPass(int id) {
		Scanner sc = new Scanner(System.in);
		System.out.println("password : ");
		
		while(students[id -1].count != 3) {
			//���̵� ��밡������ �˻�
			if(!checkAvailable(id)) {
				System.out.println("�ش� ī�����࿡ �����ϼ���");
				return false;
			}
			
			if(students[id - 1].checkPassword(sc.nextInt())) {
				students[id -1].count = 0;
				return true;
			}else {
				students[id -1].count++;
			}
				
		}
		students[id -1].account = false; 
		
		return false;
	}
	
	public void deposit(int id, int sel, int money) {
		if (sel == 1) {
				students[id - 1].balance += money;
			} else {
				if (students[id - 1].balance - money < 0) {
					System.out.println("�ѵ��ʰ�");
				} else 	students[id - 1].balance -= money;
			}
		
		
		System.out.println("�ܰ� : " + students[id - 1].balance);
		System.out.println("�ŷ������մϴ�");
	}

}
