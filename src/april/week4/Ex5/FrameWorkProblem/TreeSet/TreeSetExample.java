package april.week4.Ex5.FrameWorkProblem.TreeSet;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Student> treeSet = new TreeSet<Student>();
		treeSet.add(new Student("blue",96));
		treeSet.add(new Student("hong",86));
		treeSet.add(new Student("white",92));
		
		Student student = treeSet.last();
		System.out.println("�ְ����� " + student.score);
		System.out.println("�ְ������� ���� ���̵� : " + student.id);
	}

}
