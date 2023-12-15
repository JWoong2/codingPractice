package april.week3.Ex4;

public class Sales extends Employee implements Bonus{
	
	public Sales() {
		// TODO Auto-generated constructor stub
	}
	
	public Sales(String name, int number, String department, int salary) {
		super(name, number,department, salary);
	}
	
	
	@Override
	public double tax() {
		// TODO Auto-generated method stub
		return super.getSalary() * 0.13;
	}
	
	@Override
	public void incentive(int pay) {
		// TODO Auto-generated method stub
		super.setSalary(super.getSalary() + (pay * 120)/100);
	}
}
