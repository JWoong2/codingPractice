package april.week2.Ex4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] students = new Student[50];
		int index=0;
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		
		//default data
		students[index++]= new Student("ȫ�浿", 1, 1, 100, 70, 70);
		
		while(run) {
			System.out.println("1. ��� �л� ���");
			System.out.println("2. �� �л� ���� ���");
			System.out.println("3. �� �л� ���� �հ�");
			System.out.println("4. �л� ������ �Է�");
			System.out.println("5. ��� �л� ��� �հ�");
			
			switch(sc.nextInt() ) {
			case 1: 
				for(int i=0; i<index; i++) {
					students[i].showAllData();
				}
				break;
			case 2 :
				System.out.println(students[sc.nextInt()-1].getAverage());
				break;
			case 3 :
				System.out.println("�л� ���̵� : ");
				System.out.println(students[sc.nextInt()-1].getTotal());
				break;
				
			case 4 :
				System.out.println("�л� �̸� : ");
				String name = sc.next();
				System.out.println("�л� �� : ");
				int classNo = sc.nextInt();
				System.out.println("���� ���� : ");
				int kor = sc.nextInt();
				System.out.println("���� ���� : ");
				int eng = sc.nextInt();
				System.out.println("���� ���� : ");
				int math = sc.nextInt();
				
				//�л� �� ��ü �����
				students[index] = new Student(name, classNo, index++, kor, eng, math);
				break;

			case 5 : 
				for(int i = 0; i<index; i++) {
					System.out.println("�̸� : " + students[i].name + " ��� : "+ students[i].getAverage() + " ���� : " + students[i].getTotal());
					}
				break;
				
			}
			
		}
		
		
		
	}

}
