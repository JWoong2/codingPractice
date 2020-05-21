package dfs.네트워크;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<Integer>();
        boolean[] visited = new boolean[n];
        
        for(int i = 0; i<n; i++) {
        	if(visited[i]) continue;
        	queue.offer(i);
        	answer++;
        	
        	while(!queue.isEmpty()) {
        		int index = queue.poll();
        		visited[index] = true;
        		
        		for(int k = 0 ; k< computers[i].length; k++) {
        			if(k == index) continue;
        			if(computers[i][k] == 1 && !visited[k]) queue.offer(k);
        		}
        	}
        }
        
        return answer;
    }
}