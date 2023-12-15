package 백준.백트래킹.NQUEEN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int[] board;
	static int answer = 0;
	static int N;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		board = new int[N];

		dfs(0);

		System.out.println(answer);
	}

	public static void dfs(int row) {
		if (row == N) {
			answer++;
			return;
		}

		for (int i = 0; i < N; i++) {
			board[row] = i;

			if (promising(row)) {
				dfs(row + 1);
			}
		}
	}

	public static boolean promising(int n) {
		for (int i = 0; i < n; i++) {
			if (board[i] == board[n] || Math.abs(n - i) == Math.abs(board[n] - board[i])) {
				return false;
			}
		}

		return true;
	}

}
