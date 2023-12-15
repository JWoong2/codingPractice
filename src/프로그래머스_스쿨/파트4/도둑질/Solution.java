package 프로그래머스_스쿨.파트4.도둑질;

class Solution {
	public static void main(String[] args) {
		int a = solution(new int[] { 2, 1, 1, 4 });
		System.out.println(a);
	}

	public static int solution(int[] money) {
		int answer = 0;
		int length = money.length;
		int[] dp = new int[length - 1];
		int[] dp2 = new int[length];

		dp[0] = money[0];
		dp[1] = money[0];
		dp2[0] = 0;
		dp2[1] = money[1];
		
		for (int i = 2; i < length - 1; i++) {
			dp[i] = Math.max(dp[i - 2] + money[i], dp[i - 1]);
		}
		for (int i = 2; i < length; i++) {
			dp2[i] = Math.max(dp2[i - 2] + money[i], dp2[i - 1]);
		}

		return Math.max(dp[length - 2], dp2[length - 1]);
	}
}