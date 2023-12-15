package april.week3.Ex2.Stream;

import java.util.Arrays;
import java.util.List;

public class ReductionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list = Arrays.asList(
				new Student(10, "����"),
				new Student( 30, "����"),
				new Student( 20, "�����"),
				new Student( 40, "�����")
			);
			
		int sum1 = list.stream().mapToInt(Student::getScore).sum();
		int sum2 = list.stream().map(Student::getScore).reduce((a,b) -> a+b).get();
		
		System.out.println(sum1);
		System.out.println(sum2);
	}

}

