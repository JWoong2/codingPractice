package 백준.다이나믹.연속합;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		int[] dp = new int[n];
		dp[0] = sc.nextInt();
		
		for(int i=1; i<n; i++) {
			array[i] = sc.nextInt();
			dp[i] = Math.max(dp[i-1] + array[i], array[i]);
		}
		
		System.out.println(Arrays.stream(dp).max().getAsInt());
	}
}

//아이디어가 중요한 문제였다.