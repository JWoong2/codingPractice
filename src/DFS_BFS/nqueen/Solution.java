package DFS_BFS.nqueen;

// ������ ������ ���̵���ε� 

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
    		// �ش� ���� ��� i���� ���� ��ġ�Ұ�� (���� �࿡ ������ ���) 
    		if(arr[i] == arr[col]) {
    			return false;
    		}
    		/*
			 * �밢���� �����ִ� ���
			 * (���� ���� ���� ���� ���� ��찡 �밢���� �����ִ� ����)
			 */
    		else if(Math.abs(col -i) == Math.abs(arr[col]- arr[i])) {
    			return false;
    		}
    			
    	}
    	
    	return true;
    }
}