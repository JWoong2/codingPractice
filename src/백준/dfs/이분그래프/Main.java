package 백준.dfs.이분그래프;

import java.util.Scanner;

public class Main {
	static boolean[][] graph;
	static boolean[] visited;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0; i<T; i++) {
			int V = sc.nextInt();
			int E = sc.nextInt();
			graph = new boolean[V][E];
			visited = new boolean[V];
			
			for(int a=0; a<E; a++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				graph[x][y] = true;
				graph[y][x] = true;
			}
			
		}
	}
	
	private static void dfs(int x, boolean is) {
		visited[x] = true;
		
		for(int i=0; i<graph[x].length; i++) {
			
		}
	}
}
