package ���α׷��ӽ�.��������.����2.����ū����;

class Solution {
	public static void main(String[] args) {
		int n = 78;

		System.out.println(solution(n));
	}

	public static int solution(int n) {
//        ���� 1. n�� ���� ū ���ڴ� n���� ū �ڿ��� �Դϴ�.
//        ���� 2. n�� ���� ū ���ڿ� n�� 2������ ��ȯ���� �� 1�� ������ �����ϴ�.
//        ���� 3. n�� ���� ū ���ڴ� ���� 1, 2�� �����ϴ� �� �� ���� ���� �� �Դϴ�.

		String diffBinary = Integer.toBinaryString(n);
		int count = 0;

		for (int i = 0; i < diffBinary.length(); i++) {
			if (diffBinary.charAt(i) == '1') {
				count++;
			}
		}

		while (true) {
			n++;
			int diffCount2 = 0;

			String str = Integer.toBinaryString(n);
			System.out.println(str);

			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == '1') {
					diffCount2++;
				}
			}

			if (count == diffCount2)
				break;
		}

		return n;
	}
}