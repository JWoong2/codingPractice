package april.week3.Ex1.ObjectProblem;

public class Employee extends Person{
	String dept;
	public Employee(String name, int age, String dept) {
		super(name, age);
		// TODO Auto-generated constructor stub
		this.dept = dept;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public void print() {
		System.out.println("직원이름 : " + getName() + " 나이: " + getAge()+ " 부서 : " + getDept());
	}
}
