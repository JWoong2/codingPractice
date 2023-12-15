package 백준.bfs.안전영역;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point {
	int x;
	int y;

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

}

public class Main {
	static int count = 0;
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, 1, -1 };
	static int[][] board;
	static boolean[][] visited;
	static int n;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		board = new int[n][n];
		visited = new boolean[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				board[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				bfs(i, j);
			}
		}

		System.out.println(count);
	}

	private static void bfs(int x, int y) {
		if (visited[x][y] || board[x][y] == 0)
			return;
		Queue<Point> queue = new LinkedList<Point>();
		queue.add(new Point(x, y));
		count++;

		while (!queue.isEmpty()) {
			Point temp = queue.poll();

			for (int i = 0; i < 4; i++) {
				int nx = temp.x + dx[i];
				int ny = temp.y + dy[i];
				if (nx >= 0 && nx < n && ny >= 0 && ny < n) {
					if (board[nx][ny] != 0 && !visited[nx][ny]) {
						queue.add(new Point(nx, ny));
						visited[nx][ny] = true;
					}
				}

			}
		}

	}
}
