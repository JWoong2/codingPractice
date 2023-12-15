package april.week2.ObjectEx;

import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] arr = new Employee[50];
		int index=0;
		arr[index++] = new Employee("A1892", "박나래", "총괄개발부", "대리", 3500);
		arr[index++] = new Employee("B8077", "유재석", "Web개발부", "부장", 4500);
		arr[index++] = new Employee("C5691", "김동욱", "Android개발부", "과장", 4000);
		
		for(int i=0; i<index; i++) {
			arr[i].showInfo();
		}
		
		Scanner sc = new Scanner(System.in);
		
		for(Employee em : arr) {
			System.out.println("찾고싶은 사람의 ID 입력");
			if(em.no.equals(sc.next())){
				em.showInfo();
				break;
			}
		}
		
	}

}
