package 백준.그래프.섬의개수;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point {
	int x, y;

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

}

public class Main {
	static int[][] island;
	static boolean[][] visited;
	static int w, h;
	static int count;
	static int[] dx = { 0, 0, 1, -1, 1, -1, 1, -1 };
	static int[] dy = { -1, 1, 0, 0, -1, 1, 1, -1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			h = sc.nextInt();
			w = sc.nextInt();
			if (w == 0 && h == 0) {
				break;
			}
			visited = new boolean[w][h];
			island = new int[w][h];

			for (int i = 0; i < w; i++) {
				for (int j = 0; j < h; j++) {
					island[i][j] = sc.nextInt();
				}
			}

			count = 0;
			for (int i = 0; i < w; i++) {
				for (int j = 0; j < h; j++) {
					if (island[i][j] == 1 && !visited[i][j]) {
						bfs(i, j);
					}

				}
			}

			System.out.println(count);
		}
	}

	private static void bfs(int x, int y) {
		Queue<Point> queue = new LinkedList<Point>();
		queue.add(new Point(x, y));
		count++;
		visited[x][y] = true;
		island[x][y] = 5;

		while (!queue.isEmpty()) {
			Point temp = queue.poll();
			for (int i = 0; i < dx.length; i++) {
				int nx = temp.x + dx[i];
				int ny = temp.y + dy[i];

				if (0 <= nx && nx < w && 0 <= ny && ny < h) {
					if (island[nx][ny] == 1 && !visited[nx][ny]) {
						visited[nx][ny] = true;
						island[nx][ny] = 5;
						queue.add(new Point(nx, ny));
					}
				}
			}
		}
	}
}
