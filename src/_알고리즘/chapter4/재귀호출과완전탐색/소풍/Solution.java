package _�˰���.chapter4.���ȣ�������Ž��.��ǳ;

import java.util.Scanner;

// �߸��� ����

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// ������ ������ ���� ����ϴ� ������ Ǫ�� ���� ������ ����� ���� Ž���� �̿��� ������ ��� ����� ���� �� �Դϴ�.

		/*
		 * test case 2 1 0 1 4 6 0 1 1 2 2 3 3 0 0 2 1 3 6 10 0 1 0 2 1 2 1 3 1 4 2 3 2
		 * 4 3 4 2 4 3 4
		 */

		int C = sc.nextInt();

		for (int i = 0; i < C; i++) {
			n = sc.nextInt();
			int m = sc.nextInt();

			areFriends = new boolean[n][n];
			taken = new boolean[n];

			for (int j = 0; j < m; j++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				areFriends[x][y] = true;
				areFriends[y][x] = true;
			}

			System.out.println(countPairings());

		}
	}

	static int n;
	static boolean[][] areFriends;
	static boolean[] taken;

	// taken[i] ��° �л��� ¦�� �̹� ã������ true, �ƴϸ� false
	public static int countPairings() {
		// ��� �л��� ¦�� ã������ �� ���� ����� ã������ �����Ѵ�.
		boolean finished = true;

		for (int i = 0; i < n; i++) {
			if (!taken[i])
				finished = false;
		}

		if (finished)
			return 1;
		int ret = 0;

		// ���� ģ���� �� �л��� ã�� ¦�� �����ش�.
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (!taken[i] && !taken[j] && areFriends[i][j]) {
					taken[i] = taken[j] = true;
					ret += countPairings();
					taken[i] = taken[j] = false;
				}
			}
		}

		return ret;
	}
}
