package 그래프.가장먼노드;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
	static boolean[] visited;
	static boolean[][] graph;
	static int[] count;

	public static void main(String[] args) {
		int ans = solution(6, new int[][] { { 3, 6 }, { 4, 3 }, { 3, 2 }, { 1, 3 }, { 1, 2 }, { 2, 4 }, { 5, 2 } });
		System.out.println(ans);
	}

	public static int solution(int n, int[][] edge) {
		int answer = 0;

		visited = new boolean[n + 1];
		graph = new boolean[n + 1][n + 1];

		for (int i = 0; i < edge.length; i++) {
			graph[edge[i][0]][edge[i][1]] = graph[edge[i][1]][edge[i][0]] = true;
		}

		answer = bfs(1, n);

		return answer;
	}

	private static int bfs(int start, int n) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(start);
		visited[start] = true;
		count = new int[n + 1];
		while (!queue.isEmpty()) {
			int node = queue.poll();

			for (int i = 1; i <= n; i++) {
				if (graph[node][i] && !visited[i]) {
					queue.add(i);
					visited[i] = true;
					count[i] = count[node] + 1;
				}
			}

		}
		int max = Arrays.stream(count).max().getAsInt();
		int ans = 0;
		for (int i : count) {
			if (max == i)
				ans++;
		}

		return ans;
	}
}