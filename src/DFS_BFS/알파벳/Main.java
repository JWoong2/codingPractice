package DFS_BFS.알파벳;

import java.util.Scanner;

public class Main {
	static char[][] board;
	static boolean[] visited;
	static int pathCnt = 1;
	static int maxPathCnt = 1;

	static int R;
	static int C;

	public static int[] dy = { -1, 1, 0, 0 }; // 상하 좌우;
	public static int[] dx = { 0, 0, -1, 1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		R = sc.nextInt();
		C = sc.nextInt();

		board = new char[R][C];
		visited = new boolean[26];

		for (int i = 0; i < R; i++) {
			board[i] = sc.next().toCharArray();
		}

		dfs(0, 0);

		System.out.println(maxPathCnt);
	}

	public static void dfs(int y, int x) {
		int alpha = board[y][x] - 65;
		visited[alpha] = true;
		for (int i = 0; i < 4; i++) {
			int yy = dy[i] + y;
			int xx = dx[i] + x;

			if (yy < 0 || xx < 0 || yy >= R || xx >= C)
				continue;
			int nextAlpha = board[yy][xx] - 65;
			if (visited[nextAlpha])
				continue;

			maxPathCnt = Math.max(maxPathCnt, ++pathCnt);

			dfs(yy, xx);
		}
		// 여기서 초기화 하지 않으면 다른 경로에서 접근 할 수 없다.
		pathCnt--;
		visited[alpha] = false;
	}
}
