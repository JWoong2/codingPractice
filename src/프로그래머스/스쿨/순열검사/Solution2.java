package ���α׷��ӽ�.����.�����˻�;

import java.util.Arrays;

public class Solution2 {
	public boolean solution(int[] arr) {
		Arrays.sort(arr);
		
		return arr[arr.length-1] == arr.length;
	}
}
