package april.week1.Ex5;

public class lotto {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ball = new int[45];

		for (int i = 0; i < ball.length; i++)
			ball[i] = i + 1;

		int temp = 0; // �� ���� �ٲٴµ� ����� �ӽú���
		int j = 0; // ������ ���� �� ������ ����

		// �迭�� ����� ���� �� ���̵��� ����� ū �ݺ�Ƚ���� �����Ѵ�.
		// �迭�� ù ��° ��ҿ� ������ ��ҿ� ����� ���� ���� �ٲ㼭 ���� ���´�./
		for (int i = 0; i < 100; i++) {
			j = (int) (Math.random() * 45); // �迭 ����(0~44)�� ������ ���� ��´�.
			temp = ball[0];
			ball[0] = ball[j];
			ball[j] = temp;
		}

		// �迭 ball�� �տ��� ���� 6���� ��Ҹ� ����Ѵ�.
		for (int i = 0; i < 6; i++)
			System.out.print(ball[i] + " ");
	}
}