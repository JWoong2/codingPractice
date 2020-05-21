package week1.Ex4;

import java.util.Stack;

class Student {
	int score;
	String name, grade;

	Student() {
	}

	public Student(int score, String name) {
		super();
		this.score = score;
		this.name = name;
	}

	public void scoring(String s) {
		this.grade = s;
	}

	public void showing() {
		System.out.println("Name : " + name + " grade : " + grade);
	}
}

public class IfEx2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Student> student = new Stack<Student>();
		int idx = 0;

		Student test = new Student();

		test.name = "¿õ";
		test.score = 100;
		test.grade = "S";

		for (int i = 0; i < 50; i++) {
			student.add(new Student(i, Integer.toString(i)));
		}

		while (idx < student.size()) {
			if (student.get(idx).score > 50 && student.get(idx).score < 0) {
				System.out.println("Wrong value");
				break;
			}

			if (student.get(idx).score >= 30 && student.get(idx).score <= 50) {
				student.get(idx).scoring("A");
			} else if (student.get(idx).score >= 10 && student.get(idx).score <= 29) {
				student.get(idx).scoring("B");
			} else {
				student.get(idx).scoring("FFFFFFF");
			}
			idx++;
		}

		for (Student s : student) {
			s.showing();
		}

		System.out.println("name : " + test.name + " grade : " + test.grade + "score : " + test.score);
	}

}
