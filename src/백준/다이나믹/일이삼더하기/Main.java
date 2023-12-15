package 백준.다이나믹.일이삼더하기;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int totalNum = sc.nextInt();
		int[] answer = new int[totalNum];
		
		for (int i = 0; i < totalNum; i++) {
			answer[i] = dp(sc.nextInt(), i);
		}
		
		for(int i : answer) {
			System.out.println(i);
		}
	}

	private static int dp(int n, int index) {
		int[] dp = new int[250];
		dp[0] = 1;
		dp[1] = 1;
		dp[2] = 2;
		
		if(n == 0) {
			return 0;
		} else if(n == 1) {
			return 1;
		} else if(n == 2) {
			return 2;
		} else {
			for (int i = 3; i <= n; i++) {
				dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
			}	
		}
		
		return dp[n];
	}
}
