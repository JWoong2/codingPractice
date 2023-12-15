package 연습문제.카카오프렌즈컬러링북;

import java.util.Stack;

class Solution {
	static int[][] picture;
	static boolean[][] visited;

	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * int[] test = solution(6, 4, new int[][] { {1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0,
	 * 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}});
	 * 
	 * System.out.println(test); }
	 */

	public int[] solution(int m, int n, int[][] picture) {
		this.picture = picture;
		visited = new boolean[m][n];

		int[] answer = bfs(m, n);
		System.out.println(answer[0]);

		return answer;
	}

	static int[] bfs(int m, int n) {
		int[] answer = new int[2];
		Stack<Integer> sx = new Stack<Integer>();
		Stack<Integer> sy = new Stack<Integer>();

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				int count = 0;
				if (picture[i][j] != 0 && !visited[i][j]) {
					count++;
					addComponent(sx, sy, i, j);
					// 영역하나 증가
					answer[0]++;
				}

				while (!sx.isEmpty()) {
					int x = sx.pop();
					int y = sy.pop();

					if (x > 0 && picture[x - 1][y] == picture[i][j] && !visited[x - 1][y]) {
						addComponent(sx, sy, x - 1, y);
						count++;
					}

					if (y > 0 && picture[x][y - 1] == picture[i][j] && !visited[x][y - 1]) {
						addComponent(sx, sy, x, y - 1);
						count++;
					}

					if (x < m - 1 && picture[x + 1][y] == picture[i][j] && !visited[x + 1][y]) {
						addComponent(sx, sy, x + 1, y);
						count++;
					}

					if (y < n - 1 && picture[x][y + 1] == picture[i][j] && !visited[x][y + 1]) {
						addComponent(sx, sy, x, y + 1);
						count++;
					}
				}

				answer[1] = Math.max(count, answer[1]);
			}
		}

		return answer;
	}

	static void addComponent(Stack<Integer> sx, Stack<Integer> sy, int x, int y) {
		sx.add(x);
		sy.add(y);
		visited[x][y] = true;
	}
}