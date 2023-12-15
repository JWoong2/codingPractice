package april.week2.Ex4;

public class Student {
	String name;
	int classNo;
	int no;
	int score_k;
	int score_e;
	int score_m;
	public Student(String name, int classNo, int no, int score_k, int score_e, int score_m) {
		super();
		this.name = name;
		this.classNo = classNo;
		this.no = no;
		this.score_k = score_k;
		this.score_e = score_e;
		this.score_m = score_m;
	}
	
	public void showAllData() {
		System.out.println("이름 : " + name + "반번호 : " + classNo + "학생번호 : " + no);
	}
	
	public int getTotal() {
		return score_k+score_e + score_m;
	}
	
	public double getAverage() {
		return (double) (getTotal()/3);
	}
}
