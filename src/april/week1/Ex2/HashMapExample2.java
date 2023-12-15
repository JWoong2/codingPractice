package april.week1.Ex2;

import java.util.*;

public class HashMapExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Student, Integer> map =new HashMap<Student, Integer>();
		
		map.put(new Student(1,"È«±æµ¿"), 95);
		map.put(new Student(1,"È«±æµ¿"), 95);
		
		System.out.println("ÃÑ Entry ¼ö : " + map.size());
	}

}
