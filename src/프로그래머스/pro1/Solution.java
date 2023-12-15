package 프로그래머스.pro1;

import java.util.ArrayList;
import java.util.List;

class Solution {
	public static void main(String[] args) {
		int[][] dist = { { 0, 2, 3, 1 }, { 2, 0, 1, 1 }, { 3, 1, 0, 2 }, { 1, 1, 2, 0 } };
		solution(dist);
	}

	public static int[][] solution(int[][] dist) {
		int[][] answer = {};
		
		List<Integer> list = new ArrayList<Integer>();

		list.add(1);
		
		for(int i=0; i<dist.length; i++) {
			for(int j=0; j<dist.length; j++) {
				if(dist[i][j] == 0) break;
				if(j==0) continue;
				
				if(dist[j][0] == (dist[i][0] + dist[i][j])) {
					list.add(j);
				}else {
					
				}
				
			}
		}
		
		
		
		
		// 순번에따른 저장을 어떻게 시켜야할지~~~~~~
		
		return answer;
	}

}