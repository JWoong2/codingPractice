package april.week4.Ex3.Problem;

import java.util.HashMap;

public class StudentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Student, String> hasMap = new HashMap<Student,String>();
		
		hasMap.put(new Student("1"), "95");
		
		
		String score = hasMap.get(new Student("1"));
		System.out.println("1번 학생의 총점 : " + score);
	}

}
