package 찾아라프로그래밍마에스터.게임맵최단거리;

import java.util.LinkedList;
import java.util.Queue;

class Point {
	int x, y, dist;

	public Point(int x, int y ,int dist) {
		super();
		this.x = x;
		this.y = y;
		this.dist= dist;
	}

}

class Solution {
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, 1, -1 };
	static int N = 0;
	static int M = 0;
	static boolean[][] visited;

	public static void main(String[] args) {
		int ans = solution(new int[][] { { 1, 0, 1, 1, 1 }, { 1, 0, 1, 0, 1 }, { 1, 0, 1, 1, 1 }, { 1, 1, 1, 0, 1 },
				{ 0, 0, 0, 0, 1 } });
		System.out.println(ans);
	}

	public static int solution(int[][] maps) {
		visited = new boolean[maps.length][maps[0].length];

		for (int i = 0; i < maps.length; i++) {
			for (int j = 0; j < maps[i].length; j++) {
				System.out.print(visited[i][j]);
			}
			System.out.println();
		}

		N = maps.length;
		M = maps[0].length;

		int count = bfs(0, 0, 0,maps);

		for (int i = 0; i < maps.length; i++) {
			for (int j = 0; j < maps[i].length; j++) {
				System.out.print(visited[i][j]);
			}
			System.out.println();
		}

		return count;
	}

	private static int bfs(int i, int j, int dist, int[][] maps) {
		Queue<Point> queue = new LinkedList<Point>();
		queue.add(new Point(i, j, dist));
		visited[i][j] = true;

		while (!queue.isEmpty()) {
			Point temp = queue.poll();

			for (int a = 0; a < 4; a++) {
				int nx = temp.x + dx[a];
				int ny = temp.y + dy[a];
				
				if (nx >= 0 && ny >= 0 && nx < N && ny < M) {
					if (maps[nx][ny] != 0 && !visited[nx][ny]) {
						queue.add(new Point(nx, ny, temp.dist+1));
						visited[nx][ny] = true;
						
						if(nx == 4 && ny == 4) {
							return temp.dist;
						}
					}
				}
			}

		}
		return dist;
	}
}