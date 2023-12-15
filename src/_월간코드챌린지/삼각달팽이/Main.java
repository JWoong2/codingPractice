package _�����ڵ�ç����.�ﰢ������;

public class Main {
	public static void main(String[] args) {
		int[] ans = solution(4);
		
	}

	public static int[] solution(int n) {
		// �ִ� 2���迭
		int[][] tri = new int[n][n];

		// n���� �ִ� ���ڰ� ������ ���ϱ�
		int max = maxNumber(n);
		int[] answer = new int[max];
		int index = 1;

		int x = 0, y = 0;

		tri[x][y] = index++;

		// �迭�� ä���ֱ�
		while (index <= max) {

			// �� ä���
			while (x + 1 < n && tri[x + 1][y] == 0) {
				tri[++x][y] = index++;
			}

			// �� ä���
			while (y + 1 < n && tri[x][y + 1] == 0) {
				tri[x][++y] = index++;
			}

			// ���밢�� ä���
			while (tri[x - 1][y - 1] == 0) {
				tri[--x][--y] = index++;
			}
		}

		index = 0;

		// �迭 ����׿�
/*		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(tri[i][j] + " ");
			}

			System.out.println("");
		}*/

		// �� �Űܴ�� 
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (tri[i][j] != 0) answer[index++] = tri[i][j];
			}
		}

		return answer;
	}

	private static int maxNumber(int n) {
		int number = 0;

		while (n != 0) {
			number += n--;
		}

		return number;
	}
}
