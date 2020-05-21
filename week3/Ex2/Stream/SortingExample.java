package week3.Ex2.Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class SortingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntStream intStream = Arrays.stream(new int[] {
				5,3,2,1,4
		});
		intStream.sorted().forEach(e -> System.out.println(e));
		
		List<Student> list = Arrays.asList(
			new Student(10, "����"),
			new Student( 30, "����"),
			new Student( 20, "�����"),
			new Student( 40, "�����")
		);
		
		list.stream().sorted().forEach(s->System.out.println(s.getScore()));
		System.out.println();
		
		list.stream().sorted(Comparator.reverseOrder()).forEach(s->System.out.println(s.getScore()));
		list.stream().sorted((a,b) -> a.compareTo(b)).forEach(s->System.out.println(s.getScore()));
	}

}
