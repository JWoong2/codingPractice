package 프로그래머스_스쿨.파트3.게임맵최단거리;

import java.util.LinkedList;
import java.util.Queue;

class Point {
	int x, y;
	int dist;

	public Point(int x, int y, int dist) {
		super();
		this.x = x;
		this.y = y;
		this.dist = dist;
	}
}

class Solution {
	public static void main(String[] args) {
		int ans = solution(new int[][] { { 1, 0, 1, 1, 1 }, { 1, 0, 1, 0, 1 }, { 1, 0, 1, 1, 1 }, { 1, 1, 1, 0, 1 },
				{ 0, 0, 0, 0, 1 } });
		System.out.println(ans);
	}

	static boolean[][] visited;
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };
	static int N, M;

	public static int solution(int[][] maps) {
		int answer = 0;
		N = maps.length;
		M = maps[0].length;
		visited = new boolean[N][M];

		answer = bfs(maps);

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				System.out.print(visited[i][j] + " ");
			}
			System.out.println();
		}

		return answer;
	}

	private static int bfs(int[][] maps) {
		Queue<Point> queue = new LinkedList<Point>();
		queue.add(new Point(0, 0, 1));
		visited[0][0] = true;

		while (!queue.isEmpty()) {
			Point temp = queue.poll();
			int dist = temp.dist;
			if (temp.x == N - 1 && temp.y == M - 1) {
				return dist;
			}

			for (int i = 0; i < 4; i++) {
				int nx = temp.x + dx[i];
				int ny = temp.y + dy[i];

				if (nx >= 0 && ny >= 0 && nx < N && ny < M) {
					if (maps[nx][ny] != 0 && !visited[nx][ny]) {
						queue.add(new Point(nx, ny, temp.dist + 1));
						visited[nx][ny] = true;
					}
				}
			}
		}

		return -1;
	}
}