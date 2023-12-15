package april.week4.Ex2.ScoreRank;

import java.util.Arrays;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] students = new Student[5];
		int index =0;
		students[index++] = new Student("A190", 90, 100, 70);
		students[index++] = new Student("B340", 100, 80, 50);
		students[index++] = new Student("A245", 80, 90, 60);
		students[index++] = new Student("C891", 100, 95, 80);
		students[index++] = new Student("C123", 60, 50, 100);
		
		Arrays.sort(students);
		
		for(int i = 0; i<index; i++) {
			System.out.println(students[i].toString());
		}
	}
}
