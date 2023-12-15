package 프로그래머스.pro3;

class Solution {
	public static void main(String[] args) {
		int[][] dist = { { 0, 2, 3, 1 }, { 2, 0, 1, 1 }, { 3, 1, 0, 2 }, { 1, 1, 2, 0 } };
		solution(dist);
		
		
		
	}

	public static int[][] solution(int[][] dist) {
		int[][] answer = {};
		
		for(int i=0; i<dist.length; i++) {
			int temp = dist[i][0];
			
			for(int j=0; j<i; j++) {
				int diffNum = dist[i][j];
				
			}
		}
		
		
		return answer;
	}

}