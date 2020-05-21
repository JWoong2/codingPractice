package week1.Ex5.student;

import java.util.Scanner;

import week1.Ex5.card.CardList;

public class StudentMlist {
	Student students[];
	int index = 0;

	public StudentMlist(int n) {
		students = new Student[n];
		students[index++] = new Student(index, "정웅", 1234, 1, "신한");
		students[index++] = new Student(index, "부자", 1111, 2, "한국");
	}

	public void AddStudent() {
		int id, cardNum;
		int password;
		String name;
		CardList card = new CardList(50);

		Scanner sc = new Scanner(System.in);
		System.out.println("ID : ");
		id = sc.nextInt();
		System.out.println("사용할 비밀번호 : ");
		password = sc.nextInt();
		System.out.println("이름 : ");
		name = sc.next();
		System.out.println("카드사 번호 : ");
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
			//아이디 사용가능한지 검사
			if(!checkAvailable(id)) {
				System.out.println("해당 카드은행에 문의하세요");
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
					System.out.println("한도초과");
				} else 	students[id - 1].balance -= money;
			}
		
		
		System.out.println("잔고 : " + students[id - 1].balance);
		System.out.println("거래감사합니다");
	}

}
