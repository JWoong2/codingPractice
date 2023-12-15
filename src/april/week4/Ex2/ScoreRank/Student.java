package april.week4.Ex2.ScoreRank;

public class Student implements Comparable<Student> {
	private String no;
	private int kor;
	private int math;
	private int eng;
	private int total;

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public Student(String no, int kor, int math, int eng) {
		super();
		this.no = no;
		this.kor = kor;
		this.math = math;
		this.eng = eng;

		this.total = kor + math + eng;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return no + " " + total;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		/*
		 * int result = o.getTotal() - getTotal(); if(result == 0) { result =
		 * getNo().compareTo(o.getNo()); } return result;
		 */

		if (getTotal() == o.getTotal()) {
			return no.compareTo(o.no);
		} else {
			return getTotal()-o.getTotal();
		}

	}
}