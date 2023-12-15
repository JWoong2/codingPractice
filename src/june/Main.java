package june;

import java.sql.SQLData;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();
		int index=0;
		list.add(new Student("정웅", index++, "컴퓨터공학과", 2013152035, Person.male));
		list.add(new Student("장현빈", index++, "공업", 2015205536, Person.male));
		list.add(new Professor("이상호", index++, "컴퓨터공학과", 19640523, Person.male));
		list.add(new Professor("박미연", index++, "임베디드시스템", 19630523, Person.female));
		
		for(int i=0; i<index; i++) {
			if(list.get(i) instanceof Student) {
				System.out.println("학생");
				System.out.println(list.get(i).toString());	
			}
			if(list.get(i) instanceof Professor) {
				System.out.println("교수");
				System.out.println(list.get(i).toString());	
			}
		}
	}
}
