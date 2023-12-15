package _윈터코딩.농장;

import java.util.LinkedList;
import java.util.Queue;

class Point {
	int x;
	int y;

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

}

class Solution {
	static int[] answer;
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, 1, -1 };
	static int[][] board;
	static boolean[][] visited;

	public static void main(String[] args) {
		int[] ans = solution(new int[][] {{0,0,1,1},{1,1,1,1},{2,2,2,1},{0,0,0,2}} );
		
		for(int i : ans) {
			System.out.println(i);
		}
	}
	
	public static int[] solution(int[][] v) {
		answer = new int[3];
		board = v;
		visited = new boolean[v.length][v[0].length];

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				bfs(i, j);
			}
		}

		return answer;
	}

	private static void bfs(int x, int y) {
		if (visited[x][y] == true) return;
		
		Queue<Point> queue = new LinkedList<Point>();
		queue.add(new Point(x, y));
		answer[board[x][y]]++;

		while (!queue.isEmpty()) {
			Point temp = queue.poll();

			for (int i = 0; i < 4; i++) {
				int nx = temp.x + dx[i];
				int ny = temp.y + dy[i];
				if (nx >= 0 && nx < board.length && ny >= 0 && ny < board[0].length) {
					if (board[nx][ny] == board[x][y] && !visited[nx][ny]) {
						queue.add(new Point(nx, ny));
						visited[nx][ny] = true;
					}
				}

			}
		}

	}
}