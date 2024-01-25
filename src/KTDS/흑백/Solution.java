package KTDS.흑백;

import java.util.PriorityQueue;

public class Solution {
	public static void main(String[] args) {
		int[][] v = { { 1, 1, 0, 1, 1 }, { 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0 }, { 1, 1, 0, 1, 1 }, { 1, 0, 1, 1, 1 },
				{ 1, 0, 1, 1, 1 }, };

		// result [4,8]

		int[] answer = solution(v);

		for (int i : answer)
			System.out.println(i);
	}

	static class Area implements Comparable<Area> {
		int x, y, size;

		public Area(int x, int y, int size) {
			super();
			this.x = x;
			this.y = y;
			this.size = size;
		}

		@Override
		public int compareTo(Area o) {
			// TODO Auto-generated method stub
			return this.size - o.size;
		}

	}

	static boolean[][] visited;
	static int[][] board;
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };
	static int count = 0;
	static int maxSize = 0;
	static int x;
	static int y;

	public static int[] solution(int[][] v) {
		int[] answer = new int[2];
		x = v.length;
		y = v[0].length;

		board = new int[x][y];
		visited = new boolean[x][y];

		for (int i = 0; i < v.length; i++) {
			board[i] = v[i];
		}

		// 시작이 0 이 아닐 수 있음
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				bfs(i, j);
			}
		}

		answer[0] = count;
		answer[1] = maxSize;
		return answer;
	}

	public static void bfs(int startX, int startY) {
		if (visited[startX][startY] || board[startX][startY] == 0)
			return;

		PriorityQueue<Area> pq = new PriorityQueue<Solution.Area>();
		pq.add(new Area(startX, startY, 1));
		visited[startX][startY] = true;

		int size = 0;
		count++;

		while (!pq.isEmpty()) {
			Area temp = pq.poll();
			size++;
			
			for (int i = 0; i < 4; i++) {
				int nx = temp.x + dx[i];
				int ny = temp.y + dy[i];

				if (nx >= 0 && ny >= 0 && nx < x && ny < y) {
					if (!visited[nx][ny] && board[nx][ny] == 1) {
						pq.add(new Area(nx, ny, temp.size + 1));
						visited[nx][ny] = true;
					}
				}
			}
		}
		
		maxSize = Math.max(maxSize, size);
	}
}
