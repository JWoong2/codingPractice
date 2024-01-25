package 프로그래머스.연습문제.레벨0.가까운수;

import java.util.Arrays;

public class Solution {
	public static void main(String[] args) {
//		int[] array = { 3, 10, 28 };
//		int n = 20;
		// result : 28
		
		int[] array = { 3, 1};
		int n = 2;
		
		System.out.println(solution(array, n));
	}

	public static int solution(int[] array, int n) {
		int answer = 0;
		int min = Integer.MAX_VALUE;
		
		Arrays.sort(array);
		
		for(int i : array) {
			if(min > Math.abs(i - n)) {
				min = Math.abs(i - n);
				answer = i;
			}
		}
		
		return answer;
	}
}
