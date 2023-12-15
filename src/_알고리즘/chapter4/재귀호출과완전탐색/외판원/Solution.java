package _알고리즘.chapter4.재귀호출과완전탐색.외판원;

import java.util.Scanner;
import java.util.Stack;

public class Solution {
	static double[][] dist;
	static boolean[] visited;
	static int n;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt(); // 도시의 수
		dist = new double[n][n]; // 두 도시 간의 거리를 저장하는 배열

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				dist[i][j] = sc.nextDouble();
			}
		}

		// visited : 각 도시의 방문 여부
		visited = new boolean[n];

		Stack<Integer> path = new Stack<>();

		double answer = Double.MAX_VALUE;

		for (int i = 0; i < n; i++) {
			path.push(i);
			visited[i] = true;

			double res = shortestPath(path, 0.0);
			answer = Math.min(answer, res);

			visited[i] = false;
			path.pop();
		}

		System.out.println(answer);

	}

	// path : 지금까지 만든 경로
	// currentLength : 지금까지 만든 경로의 길이
	// 나머지 도시들을 모두 방문하는 경로들 중 가장 짧은 것의 길이를 반환한다.
	public static double shortestPath(Stack<Integer> path, double currentLength) {
		// 기저 사례 : 모든 도시를 다 방문했을 때는 시작 도시로 돌아가고 종료한다.
		if (path.size() == n) {
			return currentLength + dist[path.get(0)][path.peek()];
		}

		double ret = Double.MAX_VALUE;

		// 다음 방문할 도시를 전부 시도해 본다.
		for (int next = 0; next < n; next++) {
			if (visited[next])
				continue;

			int here = path.peek();
			path.push(next);
			visited[next] = true;
			// 나머지 경로를 재귀 호출을 통해 완성하고 가장 짧은 경로의 길이를 얻는다.
			double cand = shortestPath(path, currentLength + dist[here][next]);
			ret = Math.min(ret, cand);
			visited[next] = false;
			path.pop();
		}

		return ret;
	}
}
