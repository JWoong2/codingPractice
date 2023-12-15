package 백준.동적계획법.가장긴감소하는부분수열;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] array = new int[n];

		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}

		int[] dp = new int[n];

		for (int i = n - 1; i >= 0; i--) {
			if(dp[i] == 0 ) dp[i] = 1;
			
			for(int j= n-1; j>=0; j--) {
				if(array[i] > array[j] && dp[i] < dp[j] + 1 ) {
					dp[i] = dp[j] + 1;
				}
			}
		}
		
		System.out.println(Arrays.stream(dp).max().getAsInt());
	}

}
