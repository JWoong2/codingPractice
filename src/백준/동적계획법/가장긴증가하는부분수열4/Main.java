package 백준.동적계획법.가장긴증가하는부분수열4;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		//int[] arr = new int[n];
		int[] arr = new int[n+1];
		// int[] dp = new int[n];
		int[] dp = new int[n+1];

		// for (int i = 0; i < n; i++) {
		for (int i = 1; i <= n; i++) {
			arr[i] = sc.nextInt();
		}

		/*if (n == 1) {
			System.out.println(1);
			System.out.print(arr[0]);
			return;
		}*/

		int max = 0;

		//for (int i = 0; i < n; i++) {
		for (int i = 1; i <= n; i++) {
			if (dp[i] == 0) {
				dp[i] = 1;
			}

			for (int j = 0; j < n; j++) {
				if (arr[i] > arr[j]) {
					dp[i] = Math.max(dp[i], dp[j] + 1);
					max = Math.max(dp[i], max);
				}
			}
		}

		System.out.println(max);

		int value = max;
		Stack<Integer> stack = new Stack<>();

		// for (int i = n - 1; i >= 0; i--) {
		for (int i = n; i >= 1; i--) {
			if (value == dp[i]) {
				stack.push(arr[i]);
				value--;
			}
		}

		while (!stack.isEmpty()) {
			System.out.print(stack.pop() + " ");
		}

	}
}
