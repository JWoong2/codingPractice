package april.week4.Ex5.FrameWorkProblem;

public class Student  {
	public int studentNum=0;
	public String name;
	
	public Student(int studentNum, String name) {
		super();
		this.studentNum = studentNum;
		this.name = name;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.studentNum;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Student) {
			Student stud = (Student) obj;
			return stud.studentNum == this.studentNum;
		}
		return false;
	}
}
