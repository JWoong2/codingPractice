package _�˰���.chapter4.��������.��Ÿ���߶󳻱�;

import java.util.Scanner;

public class Solution {
	static int[] h = { 7, 1, 5, 9, 6, 7, 3 };

	public static void main(String[] args) {
		// testcase 1

		int[] heights = { 7, 1, 5, 9, 6, 7, 3 };

		System.out.println("�����ѳ༮ : " + bruteForce(h));
		System.out.println("��������    : " + solve(0, h.length - 1));
	}

	public static int solve(int left, int right) {
		// ���� ��� : ���ڰ� �ϳ��ۿ� ���� ���
		if (left == right)
			return h[left];

		// [left, mid], [mid+1, right] �� �� �������� ������ �����Ѵ�.
		int mid = (left + right) / 2;

		// ������ ������ ��������
		int ret = Math.max(solve(left, mid), solve(mid + 1, right));

		// �κ� ���� 3 : �� �κп� ��� ��ġ�� �簢�� �� ���� ū ���� ã�´�.
		int lo = mid, hi = mid + 1;
		int height = Math.min(h[lo], h[hi]);

		// [miid, mid+1]�� �����ϴ� �ʺ� 2�� �簢���� ����Ѵ�.
		ret = Math.max(ret, height * 2);

		// �簢���� �Է� ��ü�� ���� ������ Ȯ���� ������.
		while (left < lo || hi < right) {
			// �׻� ���̰� �� ���� ������ Ȯ���Ѵ�.
			if (hi < right && (lo == left || h[lo - 1] < h[hi + 1])) {
				hi++;
				height = Math.min(height, h[hi]);
			} else {
				lo--;
				height = Math.min(height, h[lo]);
			}

			// Ȯ���� �� �簢���� ����
			ret = Math.max(ret, height * (hi - lo + 1));
		}

		return ret;
	}

	// bruteForce Ǯ�̹�
	public static int bruteForce(int[] h) {
		int ret = 0;
		int N = h.length;

		for (int left = 0; left < N; left++) {
			int minnHeight = h[left];
			for (int right = left; right < N; right++) {
				minnHeight = Math.min(minnHeight, h[right]);
				ret = Math.max(ret, (right - left + 1) * minnHeight);
			}
		}

		return ret;
	}
}
