package april.week3.Ex1.ObjectProblem;

public class Teacher extends Person {
	private String subject;
	
	public Teacher(String name, int age, String subject) {
		super(name, age);
		// TODO Auto-generated constructor stub
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void print() {
		System.out.println("선생이름 : " + getName() + " 나이 : " + getAge()+ " 과목 : " + getSubject());
	}
}
