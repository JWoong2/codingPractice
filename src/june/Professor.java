package june;

public class Professor extends Person{
	int index;
	int profNum;
	String department;
	
	public Professor(String name, int index, String department, int profNum, int sex) {
		super( name, sex);
		this.index = index;
		this.department = department;
		this.profNum = profNum;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return profNum + " " + name + " " + department ;
	}
}
