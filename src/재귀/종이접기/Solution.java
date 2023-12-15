package ���.��������;

class Solution {
	  public int[] solution(int n) {
	        // n�� ���� ��, 2^n - 1 ���� ������ �����. 
	        int totalFold = (int) Math.pow(2, n) - 1;
	        int[] ret = new int[totalFold];
	        
	        setFold(-1, totalFold, 1, n, ret);
	        return ret;
	    }
	    
	    /*
	     * ������� foldCnt�� �������� mid�� ������. ���� N�� �� �����ٸ� �� ���� ���´�.
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