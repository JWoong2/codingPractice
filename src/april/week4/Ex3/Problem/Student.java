package april.week4.Ex3.Problem;

public class Student {
	private String studentNum;

	public Student(String studentNum) {
		super();
		this.studentNum = studentNum;
	}

	public String getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(String studentNum) {
		this.studentNum = studentNum;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Student s = (Student) obj;
		if (studentNum.equals(s.studentNum)) {
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub

		return studentNum.hashCode();
	}
}
