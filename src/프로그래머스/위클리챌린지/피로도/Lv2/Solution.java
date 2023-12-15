package ���α׷��ӽ�.��Ŭ��ç����.�Ƿε�.Lv2;

class Solution {

	public static void main(String[] args) {
		int k = 80;
		int[][] dungeons = { { 80, 20 }, { 50, 40 }, { 30, 10 } };

		solution(k, dungeons);

		System.out.println(ans);

	}

	static boolean[] visited;
	static int ans = 0; 

	public static int solution(int k, int[][] dungeons) {
		int answer = -1;

		visited = new boolean[dungeons.length];

		dfs(k, dungeons, 0);

		return answer;
	}

	public static void dfs(int k, int[][] dungeons, int depth) {
		// dfs ����
		for (int i = 0; i < visited.length; i++) {
			if (!visited[i] && k >= dungeons[i][0]) {
				visited[i] = true;

				dfs(k - dungeons[i][1], dungeons,  depth+1);	
				
				visited[i] = false;
			}
		}
		
		ans =  Math.max(ans, depth);
	}

}