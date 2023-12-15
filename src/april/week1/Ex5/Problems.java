package april.week1.Ex5;

import java.util.Scanner;

import april.week1.Ex5.card.CardList;
import april.week1.Ex5.student.StudentMlist;

public class Problems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentMlist studentManageList = new StudentMlist(50);
		CardList cardList = new CardList(50);

		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int id;
		int sel;
		while (run) {
			System.out.println("0. �����ڸ��");
			System.out.println("1. ���� | 2. ��� | 3. �ܰ� | 4. �ż� | 5. ����");

			switch (sel=sc.nextInt()) {
			case 1:
				System.out.println("ID : ");
				id = sc.nextInt();
				if(studentManageList.checkAvailable(id) && studentManageList.checkPass(id)) {
					System.out.println("���ݾ� : ");
					int depo = sc.nextInt();
					studentManageList.deposit(id, sel, depo);	
				}else {
					break;
				}
				break;
				
			case 2:
				System.out.println("ID : ");
				id = sc.nextInt();
				if(studentManageList.checkAvailable(id)) {
					System.out.println("���ݾ� : ");
					int depo = sc.nextInt();
					studentManageList.deposit(id, sel, depo);	
				}else {
					break;
				}
				break;
				
			case 3:
				System.out.println("ID : ");
				id = sc.nextInt();
				studentManageList.checkBal(id);

				break;

			case 4:
				studentManageList.AddStudent();
				break;

			case 5:
				run = false;
				break;
			
			case 0 : 
				studentManageList.showStudentInfo();
				break;
			}
		}
	}

}
