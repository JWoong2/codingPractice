package april.week3.Ex4;

public class Secretary extends Employee implements Bonus{
	
	public Secretary() {
		// TODO Auto-generated constructor stub
	}
	
	public Secretary(String name, int number, String department, int salary) {
		super(name, number,department, salary);
	}
	
	
	@Override
	public double tax() {
		// TODO Auto-generated method stub
		return super.getSalary() * 0.1;
	}
	
	@Override
	public void incentive(int pay) {
		// TODO Auto-generated method stub
		super.setSalary(super.getSalary() + (pay * 80)/100);
	}
}
