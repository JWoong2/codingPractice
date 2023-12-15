package june;

public class Student extends Person{
	int index;
	int studNum;
	String department;
	
	public Student(String name, int index, String department, int studNum, int sex) {
		super(name, sex);
		this.index = index;
		this.department = department;
		this.studNum = studNum;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return studNum + " " + name + " " + department ;
	}
}
