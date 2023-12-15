package 백준.동적계획법.파도반수열;

import java.util.Scanner;

public class Main {
	static long[] dp = new long[100];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] test = { 1, 1, 1, 2, 2, 3, 4, 5, 7, 9 };
		
		for (int i = 0; i < test.length; i++) {
			dp[i] = test[i];
		}
		
		// 도형 변의 길이 구하기
		for (int i = test.length; i < dp.length; i++) {
			dp[i] = dp[i-1] + dp[i-5];
		}

		// debug
		/*for(int i=0; i<dp.length; i++) {
			System.out.println(dp[i]);
		}*/
		
		// 출력 부분
		for (int i = 0; i < n; i++) {
			System.out.println(dp[sc.nextInt()-1]);
		}
	}
}
