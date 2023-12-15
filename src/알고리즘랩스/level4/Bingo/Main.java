package 알고리즘랩스.level4.Bingo;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] board = new int[5][5];

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				board[i][j] = sc.nextInt();
			}
		}

		for (int k = 0; k < 25; k++) {
			int ans = sc.nextInt();
			int count = 0;
			// 부른 것과 같다면
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					if (board[i][j] == ans) {
						board[i][j] = 0;
					}
				}
			}

			int[] row = new int[5];
			int[] col = new int[5];
			int[] cross = new int[2];

			// 0의 개수 체크
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					if (board[i][j] == 0) {
						row[i]++;
						col[j]++;
						if (i == j)
							cross[0]++;
						if (i + j == 4)
							cross[1]++;
					}
				}
			}

			for (int i = 0; i < 5; i++) {
				if (row[i] == 5) {
					count++;
				}
				if (col[i] == 5) {
					count++;
				}
			}

			if (cross[0] == 5) {
				count++;
			}
			if (cross[1] == 5) {
				count++;
			}
			
			if (count >= 3) {
				System.out.println(k + 1);
				break;
			}
		}
	}
}
