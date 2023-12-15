package 프로그래머스_스쿨.파트4.정수삼각형;

import java.util.Arrays;

class Solution {
	public static void main(String[] args) {
		int a = solution(new int[][] {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}});
		System.out.println(a);
	}
	
	public static int solution(int[][] triangle) {
		int answer = 0;
		
		int[][] dp = new int[triangle.length][];
		
		for(int i=0; i<triangle.length; i++) {
			dp[i] = new int[triangle[i].length];
		}

		for(int i=0; i<triangle.length; i++) {
			for(int j=0; j<triangle[i].length; j++) {
				dp[i][j] = triangle[i][j];
			}
		}
		
		for(int i=0; i<triangle.length; i++) {
			if(i==0) continue;
			for(int j=0; j<triangle[i].length; j++) {
				if(j==0) dp[i][j] += dp[i-1][j];
				else if(j==triangle[i].length-1) dp[i][j] += dp[i-1][j-1];
				else {
					int max = dp[i-1][j-1] > dp[i-1][j] ? dp[i-1][j-1] : dp[i-1][j];
					dp[i][j] += max;
				}
			}
		}
		
		for(int i=0; i<triangle.length; i++) {
			for(int j=0; j<triangle[i].length; j++) {
				System.out.print(dp[i][j] + " ");
			}
			System.out.println();
		}
		
		answer = Arrays.stream(dp[triangle.length-1]).max().getAsInt();
		
		return answer;
	}
}