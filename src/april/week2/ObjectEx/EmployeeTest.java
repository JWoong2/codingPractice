package april.week2.ObjectEx;

import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] arr = new Employee[50];
		int index=0;
		arr[index++] = new Employee("A1892", "�ڳ���", "�Ѱ����ߺ�", "�븮", 3500);
		arr[index++] = new Employee("B8077", "���缮", "Web���ߺ�", "����", 4500);
		arr[index++] = new Employee("C5691", "�赿��", "Android���ߺ�", "����", 4000);
		
		for(int i=0; i<index; i++) {
			arr[i].showInfo();
		}
		
		Scanner sc = new Scanner(System.in);
		
		for(Employee em : arr) {
			System.out.println("ã����� ����� ID �Է�");
			if(em.no.equals(sc.next())){
				em.showInfo();
				break;
			}
		}
		
	}

}
