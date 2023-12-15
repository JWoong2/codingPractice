package 재귀.종이접기;

import java.util.Arrays;

public class Solution3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] dap = solution(3);
		for(int i : dap) System.out.println(i);
		
		}

	public static int[] solution(int n) {
		int totalFold = (int) Math.pow(2, n)-1;
		int[] answer = new int[totalFold];
		
		fold(0, totalFold, 1, n, answer);
		
		return answer;
	}
	
	public static void fold(int start, int end, int foldCnt, int n, int[] arr) {
		if(foldCnt == n) {
			return;
		}
		
		int mid = (start+end)/2;
		int right = (start+mid)/2;
		int left = (mid+end)/2;
		
		arr[right] = 0;
		arr[left] =1;
		fold(start, mid, foldCnt+1, n, arr);
		fold(mid, end, foldCnt+1, n, arr);
		
		return;
	}
}
