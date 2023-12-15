package april.week2.Ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student {
	int score;
	int rank;
	int no;
	public Student(int score, int no) {
		super();
		this.score = score;
		this.no = no;
	}
	
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	
}

public class Rank {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] student = {60, 70, 80, 90, 75, 85, 95, 50, 45, 30};
		List<Student> list = new ArrayList<Student>();
		
		int idx =0;
		for(int i : student) list.add(new Student(i, idx++));
		
		Arrays.sort(student);
		
		for(int i=0; i<list.size(); i++) {
			for(int j = 0; j<student.length; j++) {
				if(list.get(i).score == student[j]) {
					list.get(i).setRank(student.length-j);
				}
			}
		}
		
		for(Student s : list) {
			System.out.println(s.no+ "번 학생의 점수 : " + s.score + ", 등수 : " + s.getRank());
		}		
	}
}