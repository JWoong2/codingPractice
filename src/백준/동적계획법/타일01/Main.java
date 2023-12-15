package 백준.동적계획법.타일01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();

		if(n == 1) {
			System.out.println(1);
			return ;
		}
		
		long[] dp = new long[n+1];
		
		// 00 or 1 
		/*
		1
		00 11
		100 001 111
		0011 0000 1001 1100 1111
		00111 11100 10011 00100 11111 11001 00001 10000
		*/		
		
		dp[0] = 1;
		dp[1] = 1;
		
		for(int i=2; i<=n; i++) {
			dp[i] = (dp[i-1] + dp[i-2]) % 15746; 
		}
		
		System.out.println(dp[n] );
		
	}
}
