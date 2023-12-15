package 백준.동적계획법.LCS;

import java.util.Scanner;

public class Main {
	static char[] row;
	static char[] col;
	static Integer[][] dp;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		row = sc.next().toCharArray();
		col = sc.next().toCharArray();

		dp = new Integer[row.length][col.length];

		System.out.println(LCS(row.length - 1, col.length - 1));

	}

	static int LCS(int x, int y) {
		if(x == -1 || y == -1) return 0;
		
		if(dp[x][y] == null) { 
			dp[x][y] = 0;
			
			if(row[x] == col[y]) {
				dp[x][y] = LCS(x-1, y-1) + 1;
			}else {
				dp[x][y] = Math.max(LCS(x-1, y), LCS(x, y-1));
			}
		}
		
		return dp[x][y];
	}
}
