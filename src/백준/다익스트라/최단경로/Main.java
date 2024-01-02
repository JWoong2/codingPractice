package ����.���ͽ�Ʈ��.�ִܰ��;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

//	1753��
class Node implements Comparable<Node> {
	int index;
	int cost;

	public Node(int index, int cost) {
		this.index = index;
		this.cost = cost;
	}

	@Override
	public int compareTo(Node o) {
		// TODO Auto-generated method stub
		return this.cost - o.cost;
	}
}

public class Main {
	private static final int INF = Integer.MAX_VALUE;
	static int v, e, k;
	static ArrayList<Node>[] list;
	static int[] dist;
	static boolean[] check;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		v = scan.nextInt();
		e = scan.nextInt();
		k = scan.nextInt();
		check = new boolean[v + 1]; // �湮
		list = new ArrayList[v + 1]; // �׷���
		dist = new int[v + 1]; // �Ÿ�

		Arrays.fill(dist, INF);

		// list[1] , 2 , 3, 4, 5, ...
		for (int i = 1; i <= v; i++) {
			list[i] = new ArrayList<>();
		}

		// ����Ʈ�� �׷��� ������ �ʱ�ȭ
		for (int i = 0; i < e; i++) {
			int start = scan.nextInt();
			int end = scan.nextInt();
			int weight = scan.nextInt();
			// start���� end�� ���� weight ����ġ
			list[start].add(new Node(end, weight));
		}

		dijkstra(k);

		for (int i = 1; i < dist.length; i++) {
			if (dist[i] == Integer.MAX_VALUE) {
				System.out.println("INF");
			} else {
				System.out.println(dist[i]);
			}
		}
	}

	private static void dijkstra(int start) {
		PriorityQueue<Node> queue = new PriorityQueue<>();
		queue.add(new Node(start, 0));
		dist[start] = 0;

		while (!queue.isEmpty()) {
			Node curNode = queue.poll();
			int cur = curNode.index;

			if (check[cur] == true)
				continue;
			check[cur] = true;

			for (Node node : list[cur]) {
				if (dist[node.index] > dist[cur] + node.cost) {
					dist[node.index] = dist[cur] + node.cost;
					queue.add(new Node(node.index, dist[node.index]));
				}
			}
		}
	}

}
