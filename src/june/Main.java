package june;

import java.sql.SQLData;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();
		int index=0;
		list.add(new Student("����", index++, "��ǻ�Ͱ��а�", 2013152035, Person.male));
		list.add(new Student("������", index++, "����", 2015205536, Person.male));
		list.add(new Professor("�̻�ȣ", index++, "��ǻ�Ͱ��а�", 19640523, Person.male));
		list.add(new Professor("�ڹ̿�", index++, "�Ӻ����ý���", 19630523, Person.female));
		
		for(int i=0; i<index; i++) {
			if(list.get(i) instanceof Student) {
				System.out.println("�л�");
				System.out.println(list.get(i).toString());	
			}
			if(list.get(i) instanceof Professor) {
				System.out.println("����");
				System.out.println(list.get(i).toString());	
			}
		}
	}
}
