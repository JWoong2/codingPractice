package 백준.동적계획법.가장긴증가하는부분수열;

import java.util.Scanner;

public class Main {
	static int[] array, dp;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		array = new int[n];
		dp = new int[n];

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}

	}

	// LIS ( Longest Increasing Subsequence )

	// Top_down 방식의 lis 구하기
	public static int lis(int n) {
		if (dp[n] == 0) {
			dp[n] = 1;

			for (int i = n - 1; i >= 0; i--) {
				if (array[i] < array[n]) {
					dp[i] = Math.max(dp[i], lis(i) + 1);
				}
			}
		}

		return dp[n];
	}

	// Bottom-up 방식의 lis 구하기
	public static void bottomUp(int n) {
		for (int i = 0; i < n; i++) {
			dp[i] = 1;

			for (int j = 0; j < i; j++) {
				if (array[j] < array[i] && dp[i] < dp[j] + 1) {
					dp[i] = dp[j] + 1;
				}
			}
		}
	}
}
