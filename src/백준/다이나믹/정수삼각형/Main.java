package 백준.다이나믹.정수삼각형;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] dp = new int[n][];
		
		for(int i=0; i<n; i++) {
			dp[i] = new int[i+1];
			for(int j=0; j<=i; j++) {
				dp[i][j] = sc.nextInt();
			}
		}
		
		for(int i=1; i<n; i++) {
			for(int j=0; j<=i; j++) {
				if(j==0) {
					dp[i][0] += dp[i-1][0];
				} else if(j==i) {
					dp[i][j] += dp[i-1][j-1];
				} else {
					dp[i][j] += Math.max(dp[i-1][j-1], dp[i-1][j]);	
				}
			}
		}
		
		//print All component 
//		for(int i=0; i<n; i++) {
//			for(int j=0; j<=i; j++) {
//				System.out.print(dp[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		int max = 0;
		for(int i=0; i<n; i++) {
			if(dp[n-1][i] > max) max = dp[n-1][i];
			
		}
		
		System.out.println(max);
	}
}
