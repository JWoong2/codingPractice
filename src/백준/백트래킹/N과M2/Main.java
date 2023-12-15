package 백준.백트래킹.N과M2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static boolean[] visited;
	static int[] arr;
	static int N;
	static int M;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
 
		// 정적변수 N과 M을 초기화해준다.
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		visited = new boolean[N];
		arr = new int[M];
		dfs(0, 0);
		System.out.println(sb);
	}
	
	public static void dfs(int index, int depth) {
		if(depth == M) {
			for(int val : arr) {
				sb.append(val).append(' ');
			}
			sb.append('\n');
			return ;
		}
		
		for(int i=index; i< N; i++) {
			if(visited[i] == false) {
				visited[i] = true;
				arr[depth] = i + 1;
				dfs(i+1 , depth + 1);
				visited[i] = false;
			}
		}
		return ;
	}
}