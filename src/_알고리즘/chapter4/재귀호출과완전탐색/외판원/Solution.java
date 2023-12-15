package _�˰���.chapter4.���ȣ�������Ž��.���ǿ�;

import java.util.Scanner;
import java.util.Stack;

public class Solution {
	static double[][] dist;
	static boolean[] visited;
	static int n;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt(); // ������ ��
		dist = new double[n][n]; // �� ���� ���� �Ÿ��� �����ϴ� �迭

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				dist[i][j] = sc.nextDouble();
			}
		}

		// visited : �� ������ �湮 ����
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

	// path : ���ݱ��� ���� ���
	// currentLength : ���ݱ��� ���� ����� ����
	// ������ ���õ��� ��� �湮�ϴ� ��ε� �� ���� ª�� ���� ���̸� ��ȯ�Ѵ�.
	public static double shortestPath(Stack<Integer> path, double currentLength) {
		// ���� ��� : ��� ���ø� �� �湮���� ���� ���� ���÷� ���ư��� �����Ѵ�.
		if (path.size() == n) {
			return currentLength + dist[path.get(0)][path.peek()];
		}

		double ret = Double.MAX_VALUE;

		// ���� �湮�� ���ø� ���� �õ��� ����.
		for (int next = 0; next < n; next++) {
			if (visited[next])
				continue;

			int here = path.peek();
			path.push(next);
			visited[next] = true;
			// ������ ��θ� ��� ȣ���� ���� �ϼ��ϰ� ���� ª�� ����� ���̸� ��´�.
			double cand = shortestPath(path, currentLength + dist[here][next]);
			ret = Math.min(ret, cand);
			visited[next] = false;
			path.pop();
		}

		return ret;
	}
}
