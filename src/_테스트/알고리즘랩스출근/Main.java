package _테스트.알고리즘랩스출근;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

class Point {
	int x, y, score;

	public Point(int x, int y, int score) {
		super();
		this.x = x;
		this.y = y;
		this.score = score;
	}
}

public class Main {
	static boolean[][] visited;
	static int[][] board;
	static int n; // 경로의 수
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };
	static int row, col;
	static int maxScore;

	public static void main(String[] args) {

		// Please Enter Your Code Here
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		int testCase = 1;
		for (int a = 0; a < T; a++) {
			row = sc.nextInt();
			col = sc.nextInt();
			n = 0;
			board = new int[row][col];
			visited = new boolean[row][col];

			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					board[i][j] = sc.nextInt();
				}
			}

			bfs(new Point(0, 0, 1));

			if (n == 0) {
				System.out.println("#" + testCase++ + " " + 0 + " " + -1);
			} else {
				System.out.println("#" + testCase++ + " " + n + " " + maxScore);
			}
		}
	}

	private static void bfs(Point p) {
		Queue<Point> queue = new LinkedList<Point>();
		queue.add(p);

		List<Integer> list = new ArrayList<Integer>();
		list.add(1);

		while (!queue.isEmpty()) {
			Point temp = queue.poll();

			if (temp.x == row - 1 && temp.y == col - 1) {
				n++;
				maxScore = Math.max(temp.score, maxScore);
			}

			for (int i = 0; i < 4; i++) {
				int nx = temp.x + dx[i];
				int ny = temp.y + dy[i];

				if (nx >= 0 && ny >= 0 && nx < row && ny < col) {
					if (!list.contains(board[nx][ny]) && !visited[nx][ny]) {
						list.add(board[nx][ny]);
						queue.add(new Point(nx, ny, temp.score + board[nx][ny]));
						visited[nx][ny] = true;
					}
				}
			}
		}
	}
}