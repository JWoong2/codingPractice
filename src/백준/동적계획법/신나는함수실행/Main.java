package 백준.동적계획법.신나는함수실행;

import java.util.Scanner;

public class Main {

	static int[][][] dp = new int[21][21][21];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a, b, c;

		while (true) {
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();

			if (a == -1 && b == -1 && c == -1) {
				break;
			}

			// 함수가 들어갈 곳;
			System.out.println("w(" + a + ", " + b + ", " + c + ") = " + w(a, b, c));
		}
	}

	public static int w(int a, int b, int c) {
		if (checkRange(a, b, c) && dp[a][b][c] != 0) {
			return dp[a][b][c];
		}

		if (a <= 0 || b <= 0 || c <= 0) {
			return 1;
		}

		if (a > 20 || b > 20 || c > 20)
			return dp[20][20][20] = w(20, 20, 20);

		if (a < b && b < c)
			return dp[a][b][c] = w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c);

		return dp[a][b][c] = w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1);
	}

	public static boolean checkRange(int a, int b, int c) {
		return 0 <= a && a <= 20 && 0 <= b && b <= 20 && 0 <= c && c <= 20;
	}
}
