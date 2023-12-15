package ���α׷��ӽ�.��Ŭ��ç����.�ּ����簢��.Lv1;

public class Solution {
	public static void main(String[] args) {
		int[][] sizes = { { 60, 50 }, { 30, 70 }, { 60, 30 }, { 80, 40 } };

		int answer = solution(sizes);

		System.out.println(answer);
	}

	public static int solution(int[][] sizes) {
		// �迭�� ���� ������, ���� ����� �����Ͽ� �ּ� �������� ���簢���� ������ ���� ��ǥ�̴�.

		// �迭[0] �� �� ��
		// �迭[1] �� �� ��
		int rowMax = 0;
		int colMax = 0;

		for (int i = 0; i < sizes.length; i++) {
			int r = Math.max(sizes[i][0], sizes[i][1]);
			int c = Math.min(sizes[i][0], sizes[i][1]);
			
			rowMax = Math.max(rowMax, r);
			colMax = Math.max(colMax, c);
		}

		return rowMax * colMax;
	}

}
