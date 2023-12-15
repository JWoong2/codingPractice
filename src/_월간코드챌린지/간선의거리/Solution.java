package _월간코드챌린지.간선의거리;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

class Solution {
	static int maxDistance = 0;
	static int[][] edge;
	static int size;
	static LinkedList<Integer>[] list ;
	
	
	public static void main(String[] args) {
		int ans = solution(4, new int[][] { { 1, 2 }, { 2, 3 }, { 3, 4 } });
		//int ans = solution(5, new int[][] {{1,5},{2,5},{3,5},{4,5}});

		System.out.println(ans);
	}

	public static int solution(int n, int[][] edges) {
		Set<Integer> set = new HashSet<>();
		edge = edges;
		size = n;
		for (int i = 0; i < edges.length; i++) {
			for (int j = 0; j < edges[i].length; j++) {
				set.add(edges[i][j]);
			}
		}

		int[] array = set.stream().mapToInt(Number::intValue).toArray();
		list = new LinkedList[size+1];
		
		for(int i=0; i<=size; i++) { //6
			list[i] = new LinkedList<Integer>();
		}
		
		for(int i=0; i<edges.length; i++) {
			//방향 없는 그래프
			list[edge[i][0]].add(edge[i][1]);
			list[edge[i][1]].add(edge[i][0]);
		}
		
		boolean[] visited = new boolean[n];
		combination(array, visited, 0, n, 3);

		return maxDistance;
	}

	// 가능한 중복을 제거한 조합을 찾기
	static void combination(int[] arr, boolean[] visited, int start, int n, int r) {
		if (r == 0) {
			print(arr, visited, n);
			return;
		}

		for (int i = start; i < n; i++) {
			visited[i] = true;
			combination(arr, visited, i + 1, n, r - 1);
			visited[i] = false;
		}
	}

	// 배열 출력
	static void print(int[] arr, boolean[] visited, int n) {
		int[] array = new int[4];
		int index = 0;

		for (int i = 0; i < n; i++) {
			if (visited[i]) {
				array[index++] = arr[i];
			}
		}

		maxDistance = findDistance(array);
	}

	private static int findDistance(int[] array) {
		int max = 0;

		int a = array[0];
		int b = array[1];
		int c = array[2];

		max = (returnDistanceResult(a, b) + returnDistanceResult(b, c) + returnDistanceResult(c, a)) / 3;

		return max;
	}

	private static int returnDistanceResult(int x, int y) {
		int result = 0;
		
		Queue<Integer> queue = new LinkedList<Integer>();
		boolean[] visited = new boolean[size+1];
		
		for(int i=0; i<size; i++) {
			if(visited[i]) continue;
			queue.offer(x);
			
			while(!queue.isEmpty()) {
				int index = queue.poll();
				if(index == y) return result;
				visited[index] = true;
				
				for(int k=0; k<edge.length; k++) {
					if(edge[k][0] == index && !visited[edge[k][0]]) {
						queue.offer(edge[k][1]);
					}
					if(edge[k][1] == index && !visited[edge[k][1]]) {
						queue.offer(edge[k][0]);
					}
				}
				
				result++;
			}
		}
		
		return result; 
	}
}

class Point {
	
}