package 백준.다이나믹.쉬운계단수;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long answer = 0;

		long[][] dp = new long[N + 1][10];

		for (int i = 1; i <= 9; i++) {
			dp[1][i] = 1;
		}

//		for(int i=2; i<=N; i++) {
//			for(int j=1; j<=9; j++) {
//				if(j==1 || i==8) {
//					dp[i][j] = (dp[i-1][9]+ dp[i-1][j])%1000000000;
//				}else if(j == 9) {
//					dp[i][j] = dp[i-1][8]%1000000000;
//				}else {
//					dp[i][j] = (dp[i-1][1]+ dp[i-1][j])%1000000000;
//				}	
//			}
//		}

		for (int i = 2; i <= N; i++) {
			for (int j = 0; j < 10; j++) {
				if (j == 0)
					dp[i][j] = dp[i - 1][1] % 1000000000;
				else if (j == 9)
					dp[i][j] = dp[i - 1][8] % 1000000000;
				else
					dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j + 1]) % 1000000000;
			}
		}

		for (int i = 1; i < 10; i++) {
			answer += dp[N][i];
		}

		System.out.println(answer);
	}
}
