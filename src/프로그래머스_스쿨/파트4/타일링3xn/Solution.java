package ���α׷��ӽ�_����.��Ʈ4.Ÿ�ϸ�3xn;

class Solution {
	public static void main(String[] args) {
		int n= 6;
		System.out.println(solution(n));
	}
	
	public static int solution(int n) {
		int answer = 0;
		int mod = 1000000007;
		long[] dp = new long[5001];

		dp[0] = 1;
		dp[2] = 3;
		for (int i = 4; i <= n; i += 2) {
			dp[i] = dp[i - 2] * 3;
			for (int j = i - 4; j >= 0; j -= 2) {
				dp[i] += dp[j] * 2;
			}
			dp[i] = dp[i] % mod;
		}

		answer = (int) dp[n];
		return answer;
	}
}