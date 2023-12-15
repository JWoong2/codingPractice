package _Dev_matching.¿À¸ñ;

class Solution {
	public static void main(String[] args) {
		int a = solution(new int[][] {
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 2, 1, 1, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 2, 1, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
		});
		System.out.println(a);
	}
	
    public static int solution(int[][] board) {
        int answer = -1;
        
        for(int i=0; i<board.length; i++) {
        	for(int j=0; j<board[i].length; j++) {
        		if(board[i][j] != 0) {
        			answer = find(board[i][j], i, j, board);
        			if(answer == 0) continue;
        			else return answer;
        		}
        	}
        }
        
        return answer;
    }
    
    private static int find(int num, int x, int y, int[][] board) {
    	int up= 0;
    	int right= 0;
    	int diagonal = 0; 
    	
    	for(int a=0; a<5; a++) {
			if(board[x][y+1] == num) {
				right++;
			}
			else if(board[x+1][y+1] == num) {
				diagonal++;
			}
			else if(board[x+1][y] == num) {
				up++;
			} else return 0;
		}
    	
    	if(up==5 || right==5 || diagonal == 5) return num;
    	return 0;
    }
}