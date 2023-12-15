package _NHN.���峭��ư;

public class Solution {
	static boolean isHigh = false;

	public static void main(String[] args) {
		int ans = solution(5457, new int[] { 6, 7, 8 });

		System.out.println(ans);
	}

	public static int solution(int page, int[] broken) {
		// 100�̸�
		if (page == 100)
			return 0;

		// �ڸ���
		int length = (int) (Math.log10(page) + 1);

		int num = 1;

		for (int i = 1; i < length; i++) {
			num *= 10;
		}

		int compareNum = 0;

		for (int i = 0; i < length; i++) {
			int temp = page / num;
			page %= num;

			// ���ϸ� �ִ� �ּ� ã�°�
			compareNum += checkBroken(temp, broken) * num;

			System.out.println(compareNum);

			num /= 10;
		}

		return 0;
	}

	public static int checkBroken(int num, int[] broken) {
		boolean check = false;

		while (!check) {
			check = true;

			for (int b : broken) {
				if (num == b) {
					check = false;
				}
				
			}
		}

		return num;
	}
}