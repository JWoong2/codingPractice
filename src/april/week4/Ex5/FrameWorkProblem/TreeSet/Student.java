package april.week4.Ex5.FrameWorkProblem.TreeSet;

public class Student implements Comparable<Student>{
	public String id;
	public int score=0;
	
	public Student(String string, int i) {
		// TODO Auto-generated constructor stub
		this.id = string;
		this.score = i;
	}
	
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.score - o.score;
	}
}
