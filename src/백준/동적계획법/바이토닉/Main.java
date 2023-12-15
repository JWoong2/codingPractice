package 백준.동적계획법.바이토닉;

import java.util.Scanner;

public class Main {
	static int[] array;
	static int[] up_dp;
	static int[] down_dp;
	static int n;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		array = new int[n];
		up_dp = new int[n];
		down_dp = new int[n];

		// 기본값 입력
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}

		// 정렬
		LIS();
		LDS();
		
		for(int i=0; i<up_dp.length; i++) {
			System.out.print(up_dp[i] + " ");
		}
		
		System.out.println();
		for(int i=0; i<up_dp.length; i++) {
			System.out.print(down_dp[i] + " ");
		}
		
		int max = 0;
		
		for(int i=0; i<n; i++) {
			if(max < up_dp[i] + down_dp[i]) {
				max = up_dp[i] + down_dp[i];
			}
		}
		
		System.out.println(max-1);
	}

	public static int LDS() {
		for (int i = n - 1; i >= 0; i--) {
			down_dp[i] = 1;
			
			for(int j = n-1 ; j>=0; j--) {
				if(array[i] > array[j] && down_dp[i] < down_dp[j] +1 ) {
					down_dp[i] = down_dp[j] + 1;
				}
			}
		}

		return 0;
	}

	public static int LIS() {
		for (int i = 0; i < n; i++) {
			up_dp[i] = 1;

			for (int j = 0; j < i; j++) {
				if(array[j] < array[i] && up_dp[i] < up_dp[j] +1) {
					up_dp[i] = up_dp[j] + 1;
				}
			}
		}

		return 0;
	}

}
