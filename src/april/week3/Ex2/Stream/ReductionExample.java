package april.week3.Ex2.Stream;

import java.util.Arrays;
import java.util.List;

public class ReductionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list = Arrays.asList(
				new Student(10, "Á¤¿õ"),
				new Student( 30, "Á¤¿µ"),
				new Student( 20, "±è¹ü¼ö"),
				new Student( 40, "»ç¶ûÀÌ")
			);
			
		int sum1 = list.stream().mapToInt(Student::getScore).sum();
		int sum2 = list.stream().map(Student::getScore).reduce((a,b) -> a+b).get();
		
		System.out.println(sum1);
		System.out.println(sum2);
	}

}

