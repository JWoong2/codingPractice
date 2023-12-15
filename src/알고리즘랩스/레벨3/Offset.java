package 알고리즘랩스.레벨3;

import java.util.Scanner;

public class Offset {
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };
	static String[][] board;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		board = new String[5][5];

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				board[i][j] = sc.next();
			}
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (isOffSet(i, j)) {
					board[i][j] = "*";
				}
			}
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
		
	}

	public static boolean isOffSet(int x, int y) {
		int nx = x;
		int ny = y;

		for (int i = 0; i < 4; i++) {
			nx = x + dx[i];
			ny = y + dy[i];


			
			if (nx >= 0 && ny >= 0 && nx < board.length && ny < board.length) {
				if(board[nx][ny].equals("*")) return false;
				if (Integer.parseInt(board[nx][ny]) <= Integer.parseInt(board[x][y])) {
					return false;
				}
			}
		}

		return true;
	}
}
