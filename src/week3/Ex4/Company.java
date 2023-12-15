package week3.Ex4;

import java.util.Scanner;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee[] employees = new Employee[50];
		int index = 0;
		
		employees[index++] = new Secretary("Hilery", index, "secretary", 800);
		employees[index++] = new Sales("Clinten", index, "sales", 1200);
		
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		while(run) {
			System.out.println("1. �� ��");
			System.out.println("2. �� ����");
			System.out.println("3. �⺻���� ��ȸ");
			System.out.println("4. �μ�Ƽ�� ����");
			System.out.println("5. ��� ������ ���� ��ȸ");
			
			switch (sc.nextInt()) {
			case 1:
				System.out.println("�� �̸� : ");
				String name = sc.next();
				System.out.println("�޿� : ");
				int sal = sc.nextInt();
				employees[index++] = new Secretary(name, index, "secretary", sal);
				break;

			case 2:
				System.out.println("���� �̸� : ");
				name = sc.next();
				System.out.println("�޿� : ");
				sal = sc.nextInt();
				employees[index++] = new Sales(name, index, "sales", sal);

				break;
			case 3:
				Employee e;
				for(int i = 0; i<index; i++) {
					e = employees[i];
					System.out.println(e.getName() + " " + e.getNumber() + " " + e.getSalary() + e.getDepartment());
				}
				break;
			case 4:
				int incentive = sc.nextInt();
				for(int i = 0; i<index; i++) {
					if(employees[i] instanceof Secretary) {
						Secretary s = (Secretary) employees[i];
						s.incentive(incentive);
					}
					
					if(employees[i] instanceof Sales) {
						Sales s = (Sales) employees[i];
						s.incentive(incentive);
					}
				}
				
				break;
			case 5:
				for(int i = 0; i<index; i++) {
					System.out.println("name\t department\t salary\t tax");
					if(employees[i] instanceof Secretary) {
						Secretary s = (Secretary) employees[i];
						System.out.println(s.getName() + "\t"+ s.getDepartment() + "\t" + s.getSalary() +"\t" + s.tax());
					}
					if(employees[i] instanceof Sales) {
						Sales s = (Sales) employees[i];
						System.out.println(s.getName() + "\t"+ s.getDepartment() + "\t" + s.getSalary() +"\t" + s.tax());
					}
				}
				
				break;

			default:
				run = false;
				break;
			}
		}
		
	}

}
