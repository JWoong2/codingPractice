package 프로그래머스.연습문제.레벨2.행렬테두리회전하기;

class Solution {
	public static void main(String[] args) {
		int rows = 6;
		int columns = 6;
		int[][] queries = { { 2, 2, 5, 4 }, { 3, 3, 6, 6 }, { 5, 1, 6, 3 } };

		int[] answer = solution(rows, columns, queries);

		for (int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}
	}

	public static int[] solution(int rows, int columns, int[][] queries) {
		int[] answer = new int[queries.length];

		int[][] board = new int[rows][columns];

		int nums = 1;

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				board[i][j] = nums++;
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < queries.length; i++) {
			int[] querie = queries[i];

			int r1 = querie[0] - 1;
			int c1 = querie[1] - 1;
			int r2 = querie[2] - 1;
			int c2 = querie[3] - 1;

			int temp = board[r1][c1];
			int min = temp;

			// 아래 행
			for (int j = r1; j < r2; j++) {
				board[j][c1] = board[j + 1][c1];
				if (min > board[j][c1])
					min = board[j][c1];
			}

			// 우측 열
			for (int j = c1; j < c2; j++) {
				board[r2][j] = board[r2][j + 1];
				if (min > board[r2][j])
					min = board[r2][j];
			}

			// 위 행
			for (int j = r2; j > r1; j--) {
				board[j][c2] = board[j - 1][c2];
				if (min > board[j][c2])
					min = board[j][c2];
			}

			// 왼쪽 열
			for (int j = c2; j > c1; j--) {
				board[r1][j] = board[r1][j - 1];
				if (min > board[r1][j])
					min = board[r1][j];
			}

			board[r1][c1 + 1] = temp;

			answer[i] = min;
		}

		return answer;
	}

	public static void printBoard(int[][] board, int rows, int columns) {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}
}