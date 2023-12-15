package 백준.동적계획법.가장긴감소하는부분수열;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	static int[] arr;
	static int[] dp;
	static int n;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		arr = new int[n];
		dp = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			LDS(i);
		}
		
		System.out.println(Arrays.stream(dp).max().getAsInt());
	}

	public static int LDS(int num) {
		if (dp[num] == 0) {
			dp[num] = 1;
		}

		//for (int i = n - 1; i >= 0; i--) {
			
		for (int i = num + 1; i < n; i++) {
			if (arr[num] > arr[i]) {
				dp[num] = Math.max(dp[num], LDS(i) + 1);
			}
		}

		return dp[num];
	}
}
