package 백준.다익스트라.특정한최단경로;

import java.util.ArrayList;
import java.util.Scanner;

class Node implements Comparable<Node>{
	int end;
	int cost;
	
	public Node(int end, int cost) {
		// TODO Auto-generated constructor stub
		this.cost = cost;
		this.end = end;
	}
	
	@Override
	public int compareTo(Node o) {
		// TODO Auto-generated method stub
		return this.cost - o.cost;
	}
	
}

public class Main {
	public static int[] dist;
	public static ArrayList<ArrayList<Node>> graph;
	public static boolean[] visited;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int E = scan.nextInt();
		
		graph = new ArrayList<>();
		dist = new int[N+1];
		visited = new boolean[N+1];
		
		for(int i=0; i<=N; i++) {
			graph.add(new ArrayList<>());
		}
		
		for(int i=0; i<E; i++) {
			int start = scan.nextInt();
            int end = scan.nextInt();
            int weight = scan.nextInt();
 
            // start에서 end로 가는 weight (가중치)
            graph.get(start).add(new Node(end, weight));
 
            // end에서 start로 가는 weight (가중치)
            graph.get(end).add(new Node(start, weight));
		}
		
		int v1 = scan.nextInt();
		int v2 = scan.nextInt();
		
		
		
	}
	
	public static int dijkstra(int start, int end) {
		
	}

}
