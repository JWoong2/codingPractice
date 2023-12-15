package 카카오2020_2차.택시비;

import java.util.PriorityQueue;

class Solution {
	public static int map[][], n, m, dist[];
	public static final int INF = 1000000001;

	public int solution(int n, int s, int a, int b, int[][] fares) {
		int answer = 0;

		map = new int[n][n];
		dist = new int[n];
		for (int i = 0; i < n; i++) {
			dist[i] = INF;
			for (int j = 0; j < n; j++)
				map[i][j] = INF;
		}

		m = n;

		return answer;
	}

	private static void dijkstra(int start) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.offer(start);
		map[start][start] = 0;
		dist[start] = 0;
		int i, before;
		while (!pq.isEmpty()) {
			before = pq.poll();
			for (i = 0; i < n; i++) {
				if (dist[i] > map[before][i] + dist[before]) {
					dist[i] = map[before][i] + dist[before];
					pq.offer(i);
				}
			}
		}
	}
}