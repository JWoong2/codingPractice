package 백준.다이나믹.RGB거리;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int totalHome = sc.nextInt();
		
		int[][] homeColorCost = new int[totalHome][3];
		int[][] dp = new int[totalHome][3];
		
		for(int i=0; i<totalHome; i++) {
			for (int j = 0; j < 3; j++) {
				homeColorCost[i][j] = sc.nextInt();
			}
		}
		
		dp[0][0] = homeColorCost[0][0];
		dp[0][1] = homeColorCost[0][1];
		dp[0][2] = homeColorCost[0][2];
		
		for(int i=1; i<totalHome; i++) {
			dp[i][0] = Math.min(dp[i-1][1], dp[i-1][2]) + homeColorCost[i][0];
			dp[i][1] = Math.min(dp[i-1][0], dp[i-1][2]) + homeColorCost[i][1];
			dp[i][2] = Math.min(dp[i-1][0], dp[i-1][1]) + homeColorCost[i][2];
		}
		
		int min = 3000;
		for(int i=0; i<3; i++) {
			if( dp[totalHome-1][i] < min) min = dp[totalHome-1][i];
		}
		
		System.out.println(min);
	}
}
