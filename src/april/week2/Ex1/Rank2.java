package april.week2.Ex1;

public class Rank2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] student = { 60, 70, 80, 90, 75, 85, 95, 50, 45, 30 };
		int index = 0;

		while (index < student.length) {
			int count = 0;
			for (int i = 0; i < student.length; i++) {
				if (student[index] < student[i]) {
					count++;
				}
			}
			System.out.println(index + "���� �л��� ���� : " + student[index++] + " ��� : " + (count + 1));
		}
	}
}
