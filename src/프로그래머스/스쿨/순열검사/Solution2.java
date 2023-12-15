package 프로그래머스.스쿨.순열검사;

import java.util.Arrays;

public class Solution2 {
	public boolean solution(int[] arr) {
		Arrays.sort(arr);
		
		return arr[arr.length-1] == arr.length;
	}
}
