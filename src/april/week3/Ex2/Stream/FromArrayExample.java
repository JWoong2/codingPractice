package april.week3.Ex2.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;


public class FromArrayExample {
	public static int sum =0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student> list = Arrays.asList(
				new Student(90, "홍길동" ), 
				new Student( 95, "신영권"),
				new Student(98, "유미선")
				);

		list.stream().forEach(s-> System.out.println(s.getName() + " " + s.getScore()));
		
		IntStream test = IntStream.rangeClosed(1, 100);
		
		
		test.forEach(e -> sum += e);
		System.out.println("총합 : " + sum);
	}

}

class Student implements Comparable<Student> {
	public enum Sex {MALE, FEMALE}
	public enum City { Seoul, Pusan }

	private String name;
	private Sex sex;
	private City city;
	private int age;
	private int score;
	public Student( int score, String name) {
		this.name = name;
		this.score = score;
	}
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public Student(String name, int score, Sex sex) {
		this.name = name;
		this.score = score;
		this.sex = sex;
	}
	
	public Student(String name, int score, Sex sex, City city) {
		this.name =name;
		this.score= score;
		this.sex =sex;
		this.city =city;
	}
	
	public String getName() {
		return name;
	}
	
	public int getScore() {
		return score;
	}
	
	public int getAge() {
		return age;
	}
	
	public Sex getSex() { return sex;}
	public City getCity() {return city;}
	
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return Integer.compare( score, o.score);
	}
}
