package april.week3.Ex1.ObjectProblem;

public class Student extends Person{
	int id;
	public Student(String name, int age, int id) {
		super(name, age);
		// TODO Auto-generated constructor stub
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void print() {
		System.out.println("학생이름 : " + getName() + " 나이 : " + getAge() + " 학번 : " + getId());
	}
}
