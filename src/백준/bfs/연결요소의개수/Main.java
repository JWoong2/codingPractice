package 백준.bfs.연결요소의개수;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static LinkedList<Integer>[] list ;
	static boolean[] visited;
	static int count = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		if(N == 0) {
			System.out.println(0);
			return ;
		}
		
		list = new LinkedList[N+1]; // 7
		visited = new boolean[N+1];
		
		for(int i=0; i<=N; i++) { //6
			list[i] = new LinkedList<Integer>();
		}
		
		for(int i=0; i<M; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
		
			//방향 없는 그래프
			list[x].add(y);
			list[y].add(x);
		}
		
		for(int i=1; i<=N; i++) {
				bfs(i);
		}
		
		System.out.println(count);
	}
	
	private static void bfs(int startX) {
		//첫째 줄 연결 요소의 개수 출력
		if(visited[startX]) return ;
		visited[startX] = true;
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(startX);
		count++;
		
		while(!q.isEmpty()) {
			int node = q.poll();
			
			Iterator<Integer> i = list[node].listIterator();
			while(i.hasNext()) {
				int next = i.next();
				if(!visited[next]) {
					q.add(next);
					visited[next]= true;
				}
			}
			
		}
	}
	
}
