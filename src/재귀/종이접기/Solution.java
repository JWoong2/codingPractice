package 재귀.종이접기;

class Solution {
	  public int[] solution(int n) {
	        // n번 접을 시, 2^n - 1 접힌 구간이 생긴다. 
	        int totalFold = (int) Math.pow(2, n) - 1;
	        int[] ret = new int[totalFold];
	        
	        setFold(-1, totalFold, 1, n, ret);
	        return ret;
	    }
	    
	    /*
	     * 현재까지 foldCnt번 접었으며 mid도 접혔다. 아직 N번 안 접었다면 한 번더 접는다.
	     */
	    static void setFold(int start ,int end, int foldCnt, int n, int[] ret) {
	        if(foldCnt == n) {
	            return;
	        }
	        
	        int mid = (start + end)/2;
	        int left = (start + mid)/2;
	        int right = (mid + end)/2;
	 
	        ret[left] = 0;
	        ret[right] = 1;
	 
	        setFold(start, mid, foldCnt+1, n, ret);
	        setFold(mid, end, foldCnt+1, n, ret);
	    }
}