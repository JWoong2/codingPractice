package ���α׷��ӽ�.��������.����3._���Լ��⽺���ٸ�;

class Solution2 {
	public int solution(int n, int[] cores) {
		int answer = 0;

		int min = 0; // �ð��� �ּҰ�
		int max = 10000 * n; // �ð��� �ִ밪

		int time = 0;
		int m = 0;

		while (true) {
			int mid = (min + max) / 2;

			int count = calculate(mid, cores);

			if (min > max) {

				break;
			}

			if (count >= n) { // �ش�ð����� ó���� �۾������� n�� ũ�� time�� m����
				max = mid - 1;
				time = mid;
				m = count;
			} else {
				min = mid + 1;
			}
		}

		m -= n; // ó���� �۾����� n�� ���� ����
		for (int i = cores.length - 1; i >= 0; i--) {
			if (time % cores[i] == 0) {
				if (m == 0) {
					answer = i + 1;
					break;
				}
				m--;
			}
		}

		return answer;
	}

	static int calculate(int time, int[] cores) {

		if (time == 0) { // �ð��� 0�� ��, ó���� �� �ִ� �۾����� �ھ��� ����
			return cores.length;
		}

		int count = cores.length; // �ð��� 0�� ��, ó���� �۾���

		for (int i = 0; i < cores.length; i++) { // time���� �ھ ó���� �� �ִ� �۾��� �ջ�
			count += (time / cores[i]);
		}

		return count;
	}
}
