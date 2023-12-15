package 백준.동적계획법.가장긴증가하는부분수열;

import java.util.Scanner;

public class Solution {

	static int n;
	static int[] dp1, dp2, array;

	public static void main(String[] args) {
		// 재귀로 구현해보기
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		dp1 = new int[n];
		dp2 = new int[n];
		array = new int[n];

		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			LIS(i);
			LDS(i);
		}

		for (int i = 0; i < n; i++) {
			System.out.print(dp1[i] + " ");
		}

		System.out.println();
		for (int i = 0; i < n; i++) {
			System.out.print(dp2[i] + " ");
		}

//		1 2 2 1 3 3 4 5 2 1 
//		1 5 2 1 4 3 3 3 2 1 7

		
		// 6
		// 10 30 10 20 20 10
		// 1 3 1 2 2 1

		
		int max = -1;
		for (int i = 0; i < n; i++) {
			max = Math.max(dp1[i] + dp2[i], max);
		}
		System.out.println(max - 1);

	}

	static int LIS(int num) {
		if (dp1[num] == 0) {
			dp1[num] = 1;
		}

		for (int i = num - 1; i >= 0; i--) {
			if (array[i] < array[num]) {
				dp1[num] = Math.max(dp1[num], LIS(i) + 1);
			}
		}

		return dp1[num];
	}

	static int LDS(int num) {
		if (dp2[num] == 0) {
			dp2[num] = 1;
		}

		for (int i = num + 1; i < n; i++) {
			if (array[i] < array[num]) {
				dp2[num] = Math.max(dp2[num], LDS(i) + 1);
			}
		}

		return dp2[num];
	}
}
