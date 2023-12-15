package april.week3.Ex2.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExpressionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student> list = Arrays.asList(
				new Student(90, "홍길동"), 
				new Student(95, "신영권"),
				new Student(98, "유미선")
				);

		list.stream().forEach(x -> System.out.println(x.getName() + x.getScore()));
		
		//객체의 값을 각 변수에 값을 저장
		Stream<Student> stream = list.stream();
		stream.forEach(s-> {
			String name= s.getName();
			int score = s.getScore();
			System.out.println(name + "- " + score);
		});
		
		double avg = list.stream()
				.mapToInt(Student::getScore)
				.average()
				.getAsDouble();
		
		System.out.println(avg);
	}

}


