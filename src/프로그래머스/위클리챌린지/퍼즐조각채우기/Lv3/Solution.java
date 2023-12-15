package 프로그래머스.위클리챌린지.퍼즐조각채우기.Lv3;

class Solution {
	public static void main(String[] args) {
		int[][] game_board = {{1,1,0,0,1,0},{0,0,1,0,1,0},{0,1,1,0,0,1},{1,1,0,1,1,1},{1,0,0,0,1,0},{0,1,1,1,0,0}};
		int[][] table = {{1,0,0,1,1,0},{1,0,1,0,1,0},{0,1,1,0,1,1},{0,0,1,0,0,0},{1,1,0,1,1,0},{0,1,0,0,0,0}};
		
		int answer = solution(game_board, table);
		
		System.out.println(answer);
	}
	
    public static int solution(int[][] game_board, int[][] table) {
        int answer = -1;
        return answer;
    }
    
    
    public void dfs ( ) 
    {
    	
    }
    
}