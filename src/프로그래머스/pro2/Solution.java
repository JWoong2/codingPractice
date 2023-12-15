package 프로그래머스.pro2;

class Solution {
	public static void main(String[] args) {
		String[] grid = {"??b", "abc", "cc?"};
		solution(grid);
		
	}
	
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 0};
	
	static boolean[][] visited;
	static char[][] board;
	
	public static int solution(String[] grid) {
		int answer = 0;
		
		board = new char[grid[0].length()][grid.length];
		visited = new boolean[grid[0].length()][grid.length];
		
		for(int i=0; i<grid.length; i++) {
			board[i] = grid[i].toCharArray();
		}
		
		
		
		
		
		return answer;
	}
	
	
	// dfs 탐색을 해야하나 ?가 a, b, c 일 경우를 가정하여 bfs를 돌린다
	// 방문되지 않는 결과가 있다면 false 
}