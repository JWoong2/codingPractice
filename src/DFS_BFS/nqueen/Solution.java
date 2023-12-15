package DFS_BFS.nqueen;

// 언제나 간단한 아이디어인데 

class Solution {
	
	static int[] arr;
	static int N;
	static int count = 0;
	
    public int solution(int n) {
        arr = new int[n];
        N = n;
        
        dfs(0);
        
        return count;
    }
    
    public static void dfs(int depth) {
    	if(depth == N) {
    		count++;
    		return;
    	}
    	
    	for(int i=0; i<N; i++) {
    		arr[depth] = i;
    		
    		if(isAble(depth)) {
    			dfs(depth+1);
    		}
    	}
    	
    }
    
    public static boolean isAble(int col) {
    	for(int i=0; i<col; i++) {
    		// 해당 열의 행과 i열의 행이 일치할경우 (같은 행에 존재할 경우) 
    		if(arr[i] == arr[col]) {
    			return false;
    		}
    		/*
			 * 대각선상에 놓여있는 경우
			 * (열의 차와 행의 차가 같을 경우가 대각선에 놓여있는 경우다)
			 */
    		else if(Math.abs(col -i) == Math.abs(arr[col]- arr[i])) {
    			return false;
    		}
    			
    	}
    	
    	return true;
    }
}