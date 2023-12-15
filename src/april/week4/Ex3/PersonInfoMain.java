package april.week4.Ex3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PersonInfoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern = "yyyy/MM/dd";
		DateFormat df = new SimpleDateFormat(pattern);
		Date inDate = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���ϳ⵵�� �Է��ϼ��� : " + pattern +"�� ����");
		String s = null;
		try {
			 s = sc.next();
			inDate = df.parse(s);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("���ϳ⵵�� �Է��ϼ��� : " + pattern +"�� ����");
			return;
		}
		
		System.out.println("�̸��� �Է��ϼ��� : ");
		String n = sc.next();
		
		PersonInfo person = new PersonInfo(s, n);
		
		person.printInfo();
	}

}
