package april.week2.ObjectEx;

public class Employee {
		String no;
		String name;
		String dept;
		String job;
		int sal;
		
		public Employee(String no, String name, String dept, String job, int sal) {
			super();
			this.no = no;
			this.name = name;
			this.dept = dept;
			this.job = job;
			this.sal = sal;
		}
		
		public void showInfo() {
			System.out.println(this.no+ "¿Ã∏ß : " + this.name +" " +this.dept+ " " + this.job + " "+ this.sal);
		}
}
